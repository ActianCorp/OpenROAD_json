# OpenROAD Examples and Utilities

## http-json routing examples

This OpenROAD application contains examples of http-json routing. JsonRpcServerTest and ComTest 4GL procedures show the usage of RemoteServer's Initiate() and JsonRpcRequest() methods.

You can import `httpjsonrpc.xml` in OpenROAD Workbench and run JsonRpcServerTest / ComTest 4GL procedures. Check OpenROAD Trace Window or log file for URL, Request and Response. 

To run against ORJSON_URL or local default server, issue:

	w4gldev rundbapp testdb httpjsonrpc -cjsonrpcservertest -nowindows -Tyes,logonly -Ljsonrpcservertest.log

	w4gldev rundbapp testdb httpjsonrpc -ccomtest -nowindows -Tyes,logonly -Lcomtest.log

Note: testdb is database name, where the application is imported. Check the log file under `II_LOG` or `II_SYSTEM\ingres\files` accordingly.

Alternatively you can image the application as `httpjsonrpc.img` and run using the RunImage utility.

To run against ORJSON_URL or local default server, issue:

	w4glrun httpjsonrpc.img -cjsonrpcservertest -nowindows -Tyes,logonly -Ljsonrpcservertest.log
	
	w4glrun httpjsonrpc.img -ccomtest -nowindows -Tyes,logonly -Lcomtest.log

## JsonConfig4App

This OpenROAD application generates JSON registration from OpenROAD 4GL procedures.

You can run `jsonconfig4app.img` using the RunImage utility.

To run the application command-line, issue:

	w4glrun jsonconfig4app.img -ctop -Tyes -Ljsonconfig4app.log