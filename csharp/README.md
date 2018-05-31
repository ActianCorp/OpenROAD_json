# C\# Demos

Microsoft Visual Studio need to installed to compile/build C\# code.

# C\# Demo using [HttpWebRequest](https://msdn.microsoft.com/en-us/library/system.net.httpwebrequest(v=vs.110).aspx "HttpWebRequest")

To run against `ORJSON_URL` or local default server, issue following in Visual Studio Command Prompt:
	
	csc JsonRPCtest.cs
	JsonRPCtest

# C\# Demo using a [JSON RPC 2.0 Client](https://github.com/adamashton/json-rpc-csharp "JSON RPC 2.0 Client") library

This C\# library uses [Json.NET](https://www.newtonsoft.com/json "Json.NET") framework.
As NuGet package manager is needed, Microsoft Visual Studio later than 2013 need to installed.
Follow instructions under [json-rpc-csharp](https://github.com/adamashton/json-rpc-csharp#installation "json-rpc-csharp") to build JsonRPC.dll.
Copy *JsonRPC.dll* and *Newtonsoft.Json.dll* to current directory.

To run against `ORJSON_URL` or local default server, issue following in Visual Studio Command Prompt:

	csc /r:JsonRPC.dll,Newtonsoft.Json.dll JsonRPCdemo.cs
	JsonRPCdemo
	
# C\# COM Demo

Copy *Ca.OpenROAD.dll* and *Ca.OpenROAD.Orrsolib.dll* from `II_SYSTEM\ingres\ordotnet\openroad\bin` to current directory.

run following commands from Visual Studio Command Prompt:
	
	csc /r:Ca.OpenROAD.dll,Ca.OpenROAD.Orrsolib.dll comtest_json.cs
	comtest_json