# JAVA Demos

# JAVA Demo using [HttpURLConnection](https://docs.oracle.com/javase/8/docs/api/java/net/HttpURLConnection.html "HttpURLConnection")

JDK need to installed and JAVA bin directory should be in PATH environment variable.

To run against `ORJSON_URL` or local default server, issue:
	
	javac JsonHttpURLConnection.java
	java JsonHttpURLConnection

# JAVA Demo using [Apache HttpComponents](http://hc.apache.org/httpcomponents-client-ga/tutorial/html/ "Apache HttpComponents") and [Gson](https://github.com/google/gson/blob/master/UserGuide.md "Gson")

This project needs [Maven](https://maven.apache.org/ "Maven") support. Follow instructions under [Maven Install](https://maven.apache.org/install.html "Maven Install") to install Apache Maven on your system.

To run against `ORJSON_URL` or local default server, issue:

	cd demo-app
	mvn compile
	mvn exec:java -Dexec.mainClass="com.actian.orjsonrpc.App"

Alternatively you can use [Eclipse with Maven integration](http://www.eclipse.org/m2e/ "M2Eclipse"). Import `demo-app` Maven project in Eclipse IDE and run `App.java` as Java Application.

# JAVA Demo using a [json-rpc-2.0-client](http://software.dzhuvinov.com/json-rpc-2.0-client.html "json-rpc-2.0-client") library

This project needs [Maven](https://maven.apache.org/ "Maven") support as well.

To run against `ORJSON_URL` or local default server, issue:

	cd jsonrpc-app
	mvn compile
	mvn exec:java -Dexec.mainClass="com.actian.orjsonrpc.App"

Alternatively you can import `jsonrpc-app` Maven project in [Eclipse with Maven integration](http://www.eclipse.org/m2e/ "M2Eclipse") and run `App.java` as Java Application.

# JAVA COM Demo

Copy II_SYSTEM\orjava\openroad.jar to current directory or set CLASSPATH accordingly.

Run following commands in Command Prompt / Terminal:
	
	set CLASSPATH=.;openroad.jar
	javac comtest_json.java
	java comtest_json
