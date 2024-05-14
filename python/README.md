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

To run against `ORJSON_URL` or local default server, issue:

    python jsonrpclib_demo.py


## jsonrpcclient library

This example shows how you can create JSON-RPC requests with 'request' function of [jsonrpcclient](https://pypi.org/project/jsonrpcclient/) library.
Please follow installation instructions under [jsonrpcclient](https://pypi.org/project/jsonrpcclient/) to install jsonrpcclient library.

As per [jsonrpcclient](https://pypi.org/project/jsonrpcclient/) version 4, This library only creates JSON-RPC request. To send the JSON-RPC request created by [jsonrpcclient](https://pypi.org/project/jsonrpcclient/), you need to install other HTTP library such as [requests](https://pypi.org/project/requests/).

To run against `ORJSON_URL` or local default server, issue:

    python jsonrpcclient_demo.py