# JAVA Demo using [HttpURLConnection](https://docs.oracle.com/javase/8/docs/api/java/net/HttpURLConnection.html "HttpURLConnection")

JDK need to installed and JAVA bin directory should be in PATH environment variable.

Run following commands in windows command prompt:
	
	javac JsonHttpURLConnection.java
	java JsonHttpURLConnection

# JAVA Demo using [Apache HttpComponents](http://hc.apache.org/httpcomponents-client-ga/tutorial/html/ "Apache HttpComponents") and [Gson](https://github.com/google/gson/blob/master/UserGuide.md "Gson")

This project needs [Maven](https://maven.apache.org/ "Maven") support. We have used [Eclipse with Maven integration](http://www.eclipse.org/m2e/ "M2Eclipse").

Import demo-app Maven project in Eclipse IDE and run App.java as Java Application

# JAVA Demo using a [json-rpc-2.0-client](http://software.dzhuvinov.com/json-rpc-2.0-client.html "json-rpc-2.0-client") library

This project needs [Eclipse with Maven integration](http://www.eclipse.org/m2e/ "M2Eclipse") as well.

Import jsonrpc-app Maven project in Eclipse IDE and run App.java as Java Application 

# JAVA COM Demo

Copy II_SYSTEM\orjava\openroad.jar to current directory or set CLASSPATH accordingly.

Run following commands in windows command prompt:
	
	set CLASSPATH=.;openroad.jar
	javac comtest_json.java
	java comtest_json
