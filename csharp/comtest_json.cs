using System;
using Ca.OpenROAD;
namespace comtest_json
{
	class comtest
	{
		static void Main(string[] args)
		{
			RemoteServer rso = null;
			string request;
			string response;
			try
			{
				rso = new RemoteServer();
				request = "{\"jsonrpc\": \"2.0\", \"id\": 1, \"method\": \"subtract\" , \"params\": {\"subtrahend\": 23.4, \"minuend\": 42.8}}";
				rso.Connect("jsonrpcservertest", null, null);
				response = rso.JsonRpcRequest(request);
				Console.WriteLine("#### Response ####");
				Console.WriteLine(response);
			}
			finally
			{
				if (rso != null)
				rso.Dispose();
			}
		}
	}
}
