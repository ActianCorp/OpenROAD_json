# Perl Demo

Perl 5 demo.

To run against local default server issue:

    perl demo.pl

To override URL, set operating system environment variable `ORJSON_URL`, e.g.:

## Windows
    
	set ORJSON_URL=http://HOSTNAME:8080/openroad/jsonrpcservertest
    perl demo.pl

###### Note: This demo is tested against Strawberry Perl distribution for Windows

## Linux

    env ORJSON_URL=http://HOSTNAME:8080/openroad/jsonrpcservertest 
	perl demo.pl

###### Note: You might need to install Env.pm and LWP Bundle

Sample install instructions for common Linux distributions are:

    sudo apt-get install   	# Debian/Ubuntu
    sudo yum install   		# RedHat/CentOS
	
RedHat example instructions are as follows:
	
	sudo yum install perl-Env
	sudo yum install perl-CPAN
	sudo perl -MCPAN -e 'install Bundle::LWP'