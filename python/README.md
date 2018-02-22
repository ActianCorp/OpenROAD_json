# Python Demo

## Raw json payload

This CPython 2.7, Jython 2.7, and CPython 3.6.1 demo, creates a json payload.

To run against local default server issue:

    python json_demo.py

Issue:

    python json_demo.py -h

To see more options.


## Function call

This example makes a regular function call by using [jsonrpclib](https://pypi.python.org/pypi/jsonrpclib) without the need for the caller to serialize to/from json.
Please follow installation instructions under [jsonrpclib](https://pypi.python.org/pypi/jsonrpclib) to install jsonrpclib.

**NOTE: Python 2 only (until jsonrpclib is Py3 ready).**

    python jsonrpclib_demo.py

To override URL, set operating system environment variable `ORJSON_URL`, e.g.:

Windows

    set ORJSON_URL=http://HOSTNAME:8080/openroad/jsonrpcservertest
    python jsonrpclib_demo.py

Unix / Linux

    env ORJSON_URL=http://HOSTNAME:8080/openroad/jsonrpcservertest 
	python jsonrpclib_demo.py
