# JSON RPC DEMOS

## The sub-directories/demos contained in this directory are as follows

- curl - curl demos
- html - HTML/JavaScript demos
- java - Java demos
- microsoft_jscript - Microsoft JScript demo
- nodejs - Node.js demos
- perl - Perl 5 demo
- python - Python 2 and 3 demos

Each sub-directory has its own README file with instructions.

Assumptions:

* OpenROAD is installed with JSON RPC Support.
* jsonrpcservertest is registered with sample jsonrpcservertest.img in Visual OpenROAD Server Administrator. Many of these examples make use of the `subtract()` procedure, the 4gl source for which can be found in `%II_SYSTEM%\ingres\files\orjsonsamples\jsonrpcservertest.xml`
* Tomcat is installed. Tomcat 8.5 was used in the creation of these demos.
* openroad.jar is in `{Tomcat installation folder}\lib`, for example - `C:\Program Files\Apache Software Foundation\Tomcat 8.5\lib`
* Gatekeeper3 folder contents is in `openroad` webapp, i.e. `{Tomcat installation folder}\webapps\openroad`
* `HOSTNAME` is a Full Computer Name/IP where `openroad` webapp is deployed, for example - *localhost*.
* `PORT` is a connection port number for your web server, for example - default port for Tomcat is *8080*
* Open `http://HOSTNAME:PORT/openroad/jsonrpcservertest` in your browser to confirm the server is ready

Note: Refer to **Server Reference Guide** for more details. The openroad.jar and Gatekeeper3 folder is available under orjava folder in your OpenROAD installation, that is, `%II_SYSTEM%\ingres\orjava`

## Existing comtest application

* `openroad` webapp also contain comtest servlet-mapping for existing comtest application. Refer `{Tomcat installation folder}\webapps\openroad\WEB-INF\web.xml`
* You can test comtest servlet by opening `http://HOSTNAME:PORT/openroad/comtest` in your browser.
* `comtest.json` configuration file, which contains comtest procedures’ registration entries, is provided under `%II_SYSTEM%\ingres\files\orjsonconfig`.
* You can find comtest helloworld examples under curl and html directories.

## ORJSON_URL Environment Variable

To override URL, set operating system environment variable `ORJSON_URL` for example:

#### Windows

    set ORJSON_URL=http://HOSTNAME:PORT/openroad/jsonrpcservertest

#### Unix / Linux:

    export ORJSON_URL=http://HOSTNAME:PORT/openroad/jsonrpcservertest

Note: If `ORJSON_URL` environment variable is not set, then default localhost URL `http://localhost:8080/openroad/jsonrpcservertest` is used. 
`ORJSON_URL` have no impact on HTML demos.

## Commands

* To Start/Restart OpenROAD Application Server

        net stop orsposvcx64
        net start orsposvcx64

* To Start/Restart Tomcat

        net stop tomcat8
        net start tomcat8
