package com.actian.openroad;

public class Payload {

    private String jsonrpc;
    private Number id;
    private String method;
    private Params params;
    
    private Number result;
    private Error error;
	
    public String getJsonRPC() {
		return jsonrpc;
	}
	public void setJsonRPC(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}
	
	public Number getId() {
		return id;
	}
	public void setId(Number id) {
		this.id = id;
	}
	
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	
	public Params getParams() {
		return params;
	}
	public void setParams(Params params) {
		this.params = params;
	}
	
	public Number getResult() {
		return result;
	}
	public void setResult(Number result) {
		this.result = result;
	}
	public Error getError() {
		return error;
	}
	public void setError(Error error) {
		this.error = error;
	}
    
}