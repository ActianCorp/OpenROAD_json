# Python Demos

## Raw json payload

This CPython 2.7, Jython 2.7, and CPython 3.6.1 demo, creates a json payload.

To run against `ORJSON_URL` or local default server, issue:

    python json_demo.py

Issue:

    python json_demo.py -h

To see more options.


## Function call

This example makes a regular function call by using [jsonrpclib](https://pypi.python.org/pypi/jsonrpclib) without the need for the caller to serialize to/from json.
Please follow installation instructions under [jsonrpclib](https://pypi.python.org/pypi/jsonrpclib) to install jsonrpclib.

**NOTE: Python 2 only (until jsonrpclib is Py3 ready).**

To run against `ORJSON_URL` or local default server, issue:

    python jsonrpclib_demo.py

	
## jsonrpcclient library

This example shows how you can send JSON-RPC requests with 'request' and 'notify' function of [jsonrpcclient](https://pypi.org/project/jsonrpcclient/) library.
Please follow installation instructions under [jsonrpcclient](https://pypi.org/project/jsonrpcclient/) to install jsonrpcclient library.

To run against `ORJSON_URL` or local default server, issue:

    python jsonrpcclient_demo.py