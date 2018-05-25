var http = require('http');  // Use default HTTP module in the standard library
var url = require('url');

var bodyString = JSON.stringify({
                                    "jsonrpc": "2.0",
                                    "id": 1,
                                    "method": "subtract" ,
                                    "params": {"subtrahend": 23.4, "minuend": 42.8}
                                });

var jsonrpc_url = process.env.ORJSON_URL;
if (jsonrpc_url == null) {
    jsonrpc_url = 'http://localhost:8080/openroad/jsonrpcservertest' ;
} else {
    jsonrpc_url = jsonrpc_url + "/jsonrpcservertest";
}

var url_obj = url.parse(jsonrpc_url);

var headers = {
    'Content-Type': 'application/json',
    'Content-Length': bodyString.length
};

options = url_obj;
options.method = 'POST';
options.headers = headers;

var callback = function(response) {
    var str = '';

    //another chunk of data has been received, so append it to `str`
    response.on('data', function(chunk) {
        str += chunk;
    });

    //the whole response has been received, so we just print it out here
    response.on('end', function() {
        console.log(str);
    });
};

http.request(options, callback).on('error', function(err) {
        console.log(err);
    }).write(bodyString);
