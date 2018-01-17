# JAVA Demo using [HttpURLConnection](https://docs.oracle.com/javase/8/docs/api/java/net/HttpURLConnection.html "HttpURLConnection")

JDK need to installed and JAVA bin directory should be in PATH environment variable.

Run following commands in windows command prompt:
	
	javac JsonHttpURLConnection.java
	java JsonHttpURLConnection

# JAVA Demo using [Apache HttpComponents](http://hc.apache.org/httpcomponents-client-ga/tutorial/html/ "Apache HttpComponents") and [Gson](https://github.com/google/gson/blob/master/UserGuide.md "Gson")

This project needs [Maven](https://maven.apache.org/ "Maven"). We have used [Eclipse with Maven integration](http://www.eclipse.org/m2e/ "M2Eclipse").

Run following command in windows command prompt to generate demo-app template:

	mvn archetype:generate -DgroupId=com.actian.openroad -DartifactId=demo-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

Copy all java files to demo-app\src\main\java\com\actian\openroad. Default App.java will be replaced.
Replace pom.xml as well.

Import this Maven project in Eclipse IDE and run App.java as Java Application

# JAVA Demo using a [json-rpc-2.0-client](http://software.dzhuvinov.com/json-rpc-2.0-client.html "json-rpc-2.0-client") library

This project needs [Maven](https://maven.apache.org/ "Maven") as well.

Run following commands in windows command prompt to generate jsonrpc-app template:

	mvn archetype:generate -DgroupId=com.actian.openroad -DartifactId=jsonrpc-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

Replace jsonrpc-app\src\main\java\com\actian\openroad\App.java and pom.xml.

Import this Maven project in Eclipse IDE and run App.java as Java Application 

# JAVA COM Demo

Copy II_SYSTEM\orjava\openroad.jar to current directory or set CLASSPATH accordingly.

Run following commands in windows command prompt:
	
	set CLASSPATH=.;openroad.jar
	javac comtest_json.java
	java comtest_json
