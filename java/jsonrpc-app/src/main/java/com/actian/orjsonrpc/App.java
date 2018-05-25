package com.actian.orjsonrpc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.thetransactioncompany.jsonrpc2.JSONRPC2Request;
import com.thetransactioncompany.jsonrpc2.JSONRPC2Response;
import com.thetransactioncompany.jsonrpc2.client.JSONRPC2Session;
import com.thetransactioncompany.jsonrpc2.client.JSONRPC2SessionException;

public class App {
	public static void main(String[] args) {
		URL serverURL = null;
		
		try {
			String url = System.getenv("ORJSON_URL");
			if (url == null || url.isEmpty()) {
				url = "http://localhost:8080/openroad/jsonrpcservertest";
			}else {
				url = url + "/jsonrpcservertest";
			}
			serverURL = new URL(url);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		JSONRPC2Session mySession = new JSONRPC2Session(serverURL);

		int id = 1;
		String method = "subtract";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("subtrahend", 23.4);
		params.put("minuend", 42.8);

		JSONRPC2Request request = new JSONRPC2Request(method, params, id);

		JSONRPC2Response response = null;
		try {
			response = mySession.send(request);
			
		} catch (JSONRPC2SessionException e) {
			System.err.println(e.getMessage());
		}

		if (response.indicatesSuccess())
			System.out.println("Result: " + response.getResult());
		else
			System.out.println("Error Message: " + response.getError().getMessage());
	}
}
