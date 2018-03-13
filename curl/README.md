# curl Demo 

This demo requires a [curl](https://curl.haxx.se/) binary.
For some platforms curl is available as a package and is already installed on most Linux distributions.

Sample install instructions for common Linux distributions:

    sudo apt-get install   # Debian/Ubuntu
    yum install   # RedHat/CentOS

Pre-built binaries are available from https://curl.haxx.se/download.html


## curl payload from file

Curl supports sending payloads from either a file or command line arguments.
Due to json usage of double-quotes, the first example will use a file to avoid command line escaping.

Assuming local default server, issue:

    curl http://localhost:8080/openroad/jsonrpcservertest -d @subtract_demo.json

In the example above, curl assumes a POST request.

The following example runs curl in verbose mode and explicitly sets (optional) content headers:

    curl -v --header "Content-Type: application/json" http://localhost:8080/openroad/jsonrpcservertest -d @subtract_demo.json


## curl payload from command line

curl accepts a payload from the command-line, this needs to be escaped from the CMD/shell environment:

Assuming local default server, issue:

    curl http://localhost:8080/openroad/jsonrpcservertest  -d "{\"jsonrpc\": \"2.0\", \"id\": 1, \"method\": \"subtract\" , \"params\": {\"subtrahend\": 23.4, \"minuend\": 42.8}}"

	
## curl example for existing comtest application

To call comtest helloworld procedure, assuming local default server issue:

	curl http://localhost:8080/openroad/comtest -d @helloworld.json

You can use the environment variable `ORJSON_URL` with curl, for example:

#### Windows

    set ORJSON_URL=http://HOSTNAME:PORT/openroad/comtest
    curl %ORJSON_URL% -d @helloworld.json

#### Unix / Linux:

    export ORJSON_URL=http://HOSTNAME:PORT/openroad/comtest 
	curl $ORJSON_URL -d @helloworld.json