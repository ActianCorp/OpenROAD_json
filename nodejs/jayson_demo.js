var jayson = require('jayson');  // https://www.npmjs.com/package/jayson


var jsonrpc_url = process.env.ORJSON_URL;
if (jsonrpc_url == null) {
    jsonrpc_url = 'http://localhost:8080/openroad/jsonrpcservertest' ;
}

var client = jayson.client.http(jsonrpc_url);

client.request('subtract', {subtrahend: 23.4, minuend: 42.8}, function(err, error, result) {
    if(err) throw err;
    console.log(result);
});
