# JSON RPC DEMOS

## The sub-directories/demos contained in this directory are as follows

- curl - curl demos
- html
- java - Java demos
- microsoft_jscript - Microsoft JScript demo
- nodejs - Node.js demos
- perl - Perl 5 demos
- python - Python 2 and 3 demos

Each sub-directory has its own README file with instructions.

Assumptions:
* OpenROAD is installed with JSON RPC Support.
* jsonrpcservertest is registered with sample jsonrpcservertest.img in Visual OpenROAD Server Administrator. Many of these examples make use of the `subtract()` procedure, the 4gl source for which can be found in `%II_SYSTEM%\ingres\files\orjsonsamples\jsonrpcservertest.xml`
* Tomcat is installed. Tomcat 8.5 was used in the creation of these demos.
* openroad.jar is in `C:\Program Files\Apache Software Foundation\Tomcat 8.5\lib`
* Gatekeeper3 folder contents is in `openroad` webapp, i.e. `C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\openroad`
* Open http://localhost:8080/openroad/jsonrpcservertest in your browser to confirm the server is ready

Note: Refer to **Server Reference Guide** for more details. The openroad.jar and Gatekeeper3 folder is available under orjava folder in your OpenROAD installation, that is, `%II_SYSTEM%\ingres\orjava`

## Existing comtest application

* `openroad` webapp also contain comtest servlet-mapping for existing comtest application. Refer `C:\Program Files\Apache Software Foundation\Tomcat 8.5\webapps\openroad\WEB-INF\web.xml`
* You can check comtest servlet by opening http://localhost:8080/openroad/comtest in your browser.
* `comtest.json` configuration file, which contains comtest procedures’ registration entries, is provided under `%II_SYSTEM%\ingres\files\orjsonconfig`.
* You can find comtest helloworld examples under curl and html directories.

## Commands

* To Start/Restart OpenROAD Application Server, run following using the OpenROAD Administrator Command Prompt

        net stop orsposvcx64
        net start orsposvcx64

* To Start/Restart Tomcat, run following using OpenROAD Administrator Command Prompt

        net stop tomcat8
        net start tomcat8
