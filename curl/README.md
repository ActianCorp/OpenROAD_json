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

	
## curl example for existing application

comtest servlet-mapping is available in `C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\openroad\WEB-INF\web.xml` for existing comtest application.

`comtest.json` is a configuration file containing registration entries for procedures. This file is available in `%II_SYSTEM%\ingres\files\orjsonconfig`.

For example you can find helloworld procedure configuration under "registeredprocs" - 
	
	{"name":"helloworld", "params":{"rows":[
    		{"name":"hellostring", "datatype":"varchar(100)", "isarray":false, "isnullable":true, "byref_use":true},
    		{"name":"counter", "datatype":"integer", "isarray":false, "isnullable":false, "byref_use":true}
	]}}

To call comtest helloworld procedure, assuming local server issue:

	curl http://localhost:8080/openroad/comtest -d @helloworld.json
	