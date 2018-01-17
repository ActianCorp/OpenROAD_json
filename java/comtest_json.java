import com.ca.openroad.*;

class comtest_json {
	//
	// COMExceptions are allowed to escape.
	//
	public static void main(String[] args) throws COMException
	{
		//
		// The RSO is declared here so that it can be accessed
		// from both the try block and the finally block.
		//
		RemoteServer rso = null;
		try
		{
			String request = "{\"jsonrpc\": \"2.0\", \"id\": 1, \"method\": \"subtract\" , \"params\": {\"subtrahend\": 23.4, \"minuend\": 42.8}}";
			rso = new RemoteServer();
			rso.initiate("jsonrpcservertest.img", "-Tyes", "" , null , 1);			
			System.out.println("#### Request ####");
			System.out.println(request);
			String response = rso.jsonRpcRequest(request);
			System.out.println("#### Response ####");
			System.out.println(response);
			rso.disconnect();
		}
		finally
		{
			//
			// Not catching COMExceptions. Just let them bubble up.
			// HOWEVER, we MUST ensure that the rso.release()
			// gets called regardless of exception exits. That's why we need
			// to put those in a "finally" block.
			//
			if (rso != null)
			{
				rso.release();
			}
		}
	}
}
