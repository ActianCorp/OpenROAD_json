import os
import sys
import platform

import logging
import requests
from jsonrpcclient import request, parse, Ok

DEFAULT_SERVER_URL = 'http://localhost:8080/openroad/jsonrpc?app=jsonrpcservertest'

print(sys.version)
print(platform.platform())

url = os.environ.get('ORJSON_URL')
if url is None:
   url = DEFAULT_SERVER_URL
else:
   url = url + "/jsonrpc?app=jsonrpcservertest"

print("SERVER_URL: " + url)

response = requests.post(url, json=request("subtract", params={"subtrahend": 23.4, "minuend": 42.8}))

parsed = parse(response.json())
if isinstance(parsed, Ok):
    print(parsed.result)
else:
    logging.error(parsed.message)
