import os
import sys
import platform

import jsonrpclib  # https://pypi.python.org/pypi/jsonrpclib

DEFAULT_SERVER_URL = 'http://localhost:8080/openroad/jsonrpc?app=jsonrpcservertest'

print(sys.version)
print(platform.platform())

url = os.environ.get('ORJSON_URL')

if url is None:
   url = DEFAULT_SERVER_URL
else:
   url = url + "/jsonrpc?app=jsonrpcservertest"

print(url)
server = jsonrpclib.Server(url)
result = server.subtract(subtrahend=23.4, minuend=42.8)
print(result)
assert result == 19.400
