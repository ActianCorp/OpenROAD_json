package com.actian.orjsonrpc;

import java.io.IOException;
import java.net.MalformedURLException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {

	  try {

		CloseableHttpClient client = HttpClients.createDefault();
		String url = System.getenv("ORJSON_URL");
		if (url == null || url.isEmpty()) {
			url = "http://localhost:8080/openroad/jsonrpc?app=jsonrpcservertest";
		} else {
			url = url + "/jsonrpc?app=jsonrpcservertest";
		}
		HttpPost postRequest = new HttpPost(url);
		
		Payload payload = new Payload();
		payload.setJsonRPC("2.0");
		payload.setId(1);
		payload.setMethod("subtract");
		
		Params params = new Params();
		params.setSubtrahend(23.4);
		params.setMinuend(42.8);
		payload.setParams(params);
		
		Gson gson = new Gson();
		String strJson = gson.toJson(payload);
		
		StringEntity input = new StringEntity(strJson);
		input.setContentType("application/json");
		postRequest.setEntity(input);		

		CloseableHttpResponse response = client.execute(postRequest);

		if (response.getStatusLine().getStatusCode() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
				+ response.getStatusLine().getStatusCode());
		}

		String jsonOut = EntityUtils.toString(response.getEntity(), "UTF-8");
		Payload output = gson.fromJson(jsonOut, Payload.class);
		
		if (output.getResult() == null)
		{
			System.out.println("Error Code: " + output.getError().getCode());
			System.out.println("Error Message: " + output.getError().getMessage());
		}
		else
		{
			System.out.println("Result: " + output.getResult());
		}
		client.close();

	  } catch (MalformedURLException e) {

		e.printStackTrace();

	  } catch (IOException e) {

		e.printStackTrace();

	  }

	}
}