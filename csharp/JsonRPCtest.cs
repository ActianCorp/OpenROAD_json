using System;
using System.Collections.Generic;
using System.Net;
using System.IO;

namespace JsonRPCtest
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            try{
				string webAddr = Environment.GetEnvironmentVariable("ORJSON_URL");
				if (webAddr == null) {
					webAddr = "http://localhost:8080/openroad/jsonrpc?app=jsonrpcservertest";
				}
				else
				{
					webAddr = webAddr + "/jsonrpc?app=jsonrpcservertest";
				}
                var httpWebRequest = (HttpWebRequest)WebRequest.Create(webAddr);
                httpWebRequest.ContentType = "application/json";
                httpWebRequest.Method = "POST";    

                using (var streamWriter = new StreamWriter(httpWebRequest.GetRequestStream()))
                {
                    string json = "{\"jsonrpc\": \"2.0\", \"id\": 1, \"method\": \"subtract\" , \"params\": {\"subtrahend\": 23.4, \"minuend\": 42.8}}";

                    streamWriter.Write(json);
                    streamWriter.Flush();
                }
                var httpResponse = (HttpWebResponse)httpWebRequest.GetResponse();
                using (var streamReader = new StreamReader(httpResponse.GetResponseStream()))
                {
                    var responseText = streamReader.ReadToEnd();
                    Console.WriteLine(responseText);  
                }
            }catch(WebException ex){
                Console.WriteLine(ex.Message);
            }
        }
    }
}