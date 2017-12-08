# Node.js Demo


## Raw http demo

To run against local default server issue:

    node demo.js

To override URL, set operating system environment variable `ORJSON_URL`, e.g.:

Windows

    set ORJSON_URL=http://HOSTNAME:8080/openroad/jsonrpcservertest
    node demo.js

Unix:

    env ORJSON_URL=http://HOSTNAME:8080/openroad/jsonrpcservertest node demo.js


## jayson - Third party library

There are a number of json-rpc libraries available for Node.js.
The following demo relies on a third party library, `jayson`.

Ensure `jayson` is available, e.g.:

    npm install jayson

To run against local default server issue:

    node jayson_demo.js

To override URL, set operating system environment variable `ORJSON_URL`,
as for first example.
