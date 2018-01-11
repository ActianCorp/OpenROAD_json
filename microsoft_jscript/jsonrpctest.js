processSend();

function processSend(attempts) {

    var WSHShell = new ActiveXObject("WScript.Shell");
    var ORJSON_URL = WSHShell.ExpandEnvironmentStrings("%ORJSON_URL%");
    WSHShell = null;
    if (ORJSON_URL == "%ORJSON_URL%") {
        var svcurl = "http://localhost:8080/openroad/jsonrpcservertest";
    } else {
        var svcurl = ORJSON_URL;
    }
	
	var xmlhttp = new ActiveXObject("MSXML2.ServerXMLHTTP");
    
    var data = "{\"jsonrpc\": \"2.0\", \"id\": 1, \"method\": \"subtract\" , \"params\": {\"subtrahend\": 23.4, \"minuend\": 42.8}}";
    WScript.Echo("URL " + svcurl);

    xmlhttp.open("POST", svcurl , false);

    xmlhttp.setRequestHeader("Content-Type", "application/json");

    xmlhttp.onreadystatechange = function() {
        if (xmlhttp.readyState == 4) {
            dataReceived(xmlhttp);
        }
    };

    xmlhttp.setTimeouts(5000, 60000, 10000, 10000);
    try {
        xmlhttp.send(data);
    } catch (err) {
        WScript.Echo("Error:" + err.description + "\n");
        if (!attempts || attempts < 5) {
            WScript.Echo("Retry " + ((attempts || 0) + 1) + "...");
            processSend((attempts || 0) + 1);
        } else {
            WScript.Echo("Too many attemtps.");
        }
    }

}

function dataReceived(xmlhttp) {
    var response;
    if (xmlhttp.responseXML.parseError.errorCode != 0) {
        response = xmlhttp.responseText & " " & xmlhttp.responseXML.parseError.reason;
        WScript.Echo("Response: " + response);
    } else {
        response = xmlhttp.responseText;
        WScript.Echo("Response:\n" + response + "\n");
		
		eval("json="+xmlhttp.responseText);
		WScript.Echo("Response: " + json.result);
    }
}
