using JsonRPC;
using Newtonsoft.Json.Linq;

using System;

namespace JsonRPCdemo
{
    class MainClass
    {
        public static void Main(string[] args)
        {
			string jsonURL = Environment.GetEnvironmentVariable("ORJSON_URL");
			if (jsonURL == null) {
				jsonURL = "http://localhost:8080/openroad/jsonrpc?app=jsonrpcservertest";
			}
			else
			{
				jsonURL = jsonURL + "/jsonrpc?app=jsonrpcservertest";
			}
			using (Client rpcClient = new Client(jsonURL))
			{
				JObject namedParameters = JObject.Parse(@"{ subtrahend: 23.4, minuend: 42.8 }");
				Request request = rpcClient.NewRequest("subtract", namedParameters);
				GenericResponse response = rpcClient.Rpc(request);
				
				if (response.Result != null)
				{
					Console.WriteLine(string.Format("Result:{0}",response.Result));
				}
				else
				{
					Console.WriteLine(string.Format("Error in response, code:{0} message:{1}", response.Error.Code, response.Error.Message));
				}
			}
		}
    }
}