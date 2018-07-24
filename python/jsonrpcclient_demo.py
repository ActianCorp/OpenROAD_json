import os
import sys
import platform

import jsonrpcclient

DEFAULT_SERVER_URL = 'http://localhost:8080/openroad/jsonrpcservertest'

print(sys.version)
print(platform.platform())

url = os.environ.get('ORJSON_URL')
if url is None:
   url = DEFAULT_SERVER_URL
else:
   url = url + "/jsonrpcservertest"

print("SERVER_URL: " + url)

try:
	result = jsonrpcclient.request(url, 'subtract', subtrahend=23.4, minuend=42.8)
	print("RESULT: " + str(result))
	assert result == 19.400
except Exception as inst:
	print("ERROR: " + str(inst))
	
try:
	jsonrpcclient.notify(url, 'helloworld', hellostring="HELLO", counter=0)
except Exception as inst:
	print("ERROR: " + str(inst))