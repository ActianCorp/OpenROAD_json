# OpenROAD Examples and Utilities

## http-json routing examples

This OpenROAD application contains examples of new http-json routing. 

JsonRpcTest frame can be used to connect OpenROAD JSON-RPC Servlet URL via http-json routing using RemoteServer's Initiate() method. After successful connection, JsonRpcRequest button can be used to call RemoteServer's JsonRpcRequest() method for a request string. An example request string is auto-populated.

HelloWorld frame calls helloworld procedure from comtest application, whereas Subtract frame calls subtract procedure from jsonrpcservertest application.

You can import `httpjsonrpc.xml` in OpenROAD Workbench and run JsonRpcTest, HelloWorld or Subtract frame. 

To run against ORJSON_URL or local default server, issue:

	w4gldev rundbapp testdb httpjsonrpc -cjsonrpctest -Tyes -Ljsonrpctest.log

	w4gldev rundbapp testdb httpjsonrpc -chelloworld -Tyes -Lhelloworld.log
	
	w4gldev rundbapp testdb httpjsonrpc -csubtract -Tyes -Lsubtract.log

Note: testdb is database name, where the `httpjsonrpc` application is imported. 

Alternatively you can image the application as `httpjsonrpc.img` and run using the RunImage utility.

To run against ORJSON_URL or local default server, issue:

	w4glrun httpjsonrpc.img -cjsonrpctest -Tyes -Ljsonrpctest.log
	
	w4glrun httpjsonrpc.img -chelloworld -Tyes -Lhelloworld.log

	w4glrun httpjsonrpc.img -csubtract -Tyes -Lsubtract.log

## JsonConfig4App

This OpenROAD application generates JSON registration from OpenROAD 4GL procedures.

The JsonConfig4App application image is available under [JsonConfig4App Assets](https://github.com/ActianCorp/OpenROAD_json/releases/).

Please refer the instructions under [JsonConfig4App](https://github.com/ActianCorp/OpenROAD_json/releases/) to run this application.
