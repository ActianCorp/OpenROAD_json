# curl Demo 

This demo requires a [curl](https://curl.haxx.se/) binary.
For some platforms curl is available as a package and is already installed on most Linux distributions.

Sample install instructions for common Linux distributions:

    sudo apt-get install   # Debian/Ubuntu
    yum install   # RedHat/CentOS

Pre-buitlt binaries are available from https://curl.haxx.se/download.html


## curl payload from file

Curl supports sending payloads from either a file or command line arguments.
Due json usage of double-quotes, the first example will use a file to avoid command line escaping.

Assuming local server, issue:

    curl http://localhost:8080/openroad/jsonrpcservertest -d @subtract_demo.json

In the example above, curl assumes a POST request.

The following example runs curl in verbose mode and explictly sets (optional) content headers:

    curl -v --header "Content-Type: application/json" http://localhost:8080/openroad/jsonrpcservertest -d @subtract_demo.json


## curl payload from command line

curl accepts a payload from the commandline, this needs to be escaped from the CMD/shell environment:

Assuming local server, issue:

    curl http://localhost:8080/openroad/jsonrpcservertest  -d "{\"jsonrpc\": \"2.0\", \"id\": 1, \"method\": \"subtract\" , \"params\": {\"subtrahend\": 23.4, \"minuend\": 42.8}}"
