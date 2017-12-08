# Perl Demo

Perl 5 demo.

To run against local default server issue:

    perl demo.pl

To override URL, set operating system environment variable `ORJSON_URL`, e.g.:

Windows
    set ORJSON_URL=http://HOSTNAME:8080/openroad/jsonrpcservertest
    perl demo.pl


Unix:

    env ORJSON_URL=http://HOSTNAME:8080/openroad/jsonrpcservertest perl demo.pl
