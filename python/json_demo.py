"""Python 2 and Python 3 demo for json-rpc over http.

Implements simple json-rpc call interface.

Uses subtract() with named parameters example from JSON-RPC 2.0 Specification
http://www.jsonrpc.org/specification#examples
"""

import argparse
import logging
import os
import platform
import sys

try:
    # Assume Python 3.x
    from urllib.request import Request, urlopen
    from urllib.error import URLError, HTTPError
except ImportError:
    # Assume Python 2.x
    from urllib2 import Request, urlopen
    from urllib2 import URLError, HTTPError


try:
    # raise ImportError()
    # Python 2.6+
    import json
except ImportError:
    # raise ImportError()
    import simplejson as json  # from http://code.google.com/p/simplejson


logging.basicConfig()  # NO debug, no info. But logs warnings
log = logging.getLogger("json_demo")


JSONRPC_VERSION = '2.0'
DEFAULT_SERVER_URL = 'http://localhost:8080/openroad/jsonrpc?app=jsonrpcservertest' 


def post_json(url, dict_payload=None):
    headers = {'content-type': 'application/json'}  # optionally set headers
    data = json.dumps(dict_payload).encode('utf-8')
    log.info('url: %r' % url)
    log.info('json request: %r' % data)

    req = Request(url, data, headers)
    f = urlopen(req)
    response_str = f.read()  # read entire response, could use json.load()
    f.close()

    log.info('response_str: %r' % response_str)
    response = json.loads(response_str)
    return response


def simple_json_rpc(url, function_name, params_dict=None):
    payload = {
        "method": function_name,
        "jsonrpc": JSONRPC_VERSION,
        "id": 1,
    }
    if params_dict:
        payload["params"] = params_dict
    response = post_json(url, payload)
    return response

def main(argv=None):
    if argv is None:
        argv = sys.argv

    print(sys.version)
    print(platform.platform())
    
    jsonrpc_url = os.environ.get('ORJSON_URL')

    if jsonrpc_url is None:
       jsonrpc_url = DEFAULT_SERVER_URL
    else:
       jsonrpc_url = jsonrpc_url + "/jsonrpc?app=jsonrpcservertest"

    parser = argparse.ArgumentParser(prog=argv[0], description='json-rpc demo')
    parser.add_argument("-q", "--quiet", dest="quiet", action="store_true", help="hide detail")
    parser.add_argument('-u', '--url', dest="url", help="The URL where you have registered OpenROAD with Tomcat", default=jsonrpc_url)

    args = parser.parse_args(argv[1:])

    if not args.quiet:
        log.setLevel(logging.INFO)

    log.info('json-rpc protocol version of client: %r' % JSONRPC_VERSION)
    log.info('URL: %r' % args.url)

    result = simple_json_rpc(args.url, 'subtract', {'subtrahend': 23.4, 'minuend': 42.8})
    print(result)
    assert result == {"result": 19.400, "id": 1, "jsonrpc": "2.0"}

    return 0

if __name__ == "__main__":
    sys.exit(main())
