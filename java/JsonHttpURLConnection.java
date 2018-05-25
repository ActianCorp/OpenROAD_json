import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonHttpURLConnection {

	public static void main(String[] args) throws Exception {

		JsonHttpURLConnection jsonrpc = new JsonHttpURLConnection();

		System.out.println("\nHttp JSON RPC POST request");
		jsonrpc.sendPost();

	}
	
	private void sendPost() throws Exception {
		String url = System.getenv("ORJSON_URL");
		if (url == null || url.isEmpty()) {
			url = "http://localhost:8080/openroad/jsonrpcservertest";
		} else {
			url = url + "/jsonrpcservertest";
		}
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		con.setRequestProperty("Content-Type", "application/json");
		con.setRequestMethod("POST");
		
		String urlParameters = "{\"jsonrpc\": \"2.0\", \"id\": 1, \"method\": \"subtract\" , \"params\": {\"subtrahend\": 23.4, \"minuend\": 42.8}}";

		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		System.out.println("Response : " + response.toString());

	}

}