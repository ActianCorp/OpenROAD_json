#!/usr/bin/perl

use strict;
use warnings;
use Env;
use LWP::UserAgent;

my $ua = LWP::UserAgent->new();
my $json = '{"jsonrpc": "2.0", "id": 1, "method": "subtract" , "params": {"subtrahend": 23.4, "minuend": 42.8}}';
my $server_endpoint = "http://localhost:8080/openroad/jsonrpcservertest";
if (defined $ENV{'ORJSON_URL'}) {
    $server_endpoint = $ENV{'ORJSON_URL'};
}
 
my $req = HTTP::Request->new(POST => $server_endpoint);
$req->content_type('application/json');
$req->content($json);
 
my $resp = $ua->request($req);

if ($resp->is_success) {
    
    my $message = $resp->decoded_content;
    print "Received reply: $message\n";
    
} else {
    
    print "HTTP POST error code: ", $resp->code, "\n";
    print "HTTP POST error message: ", $resp->message, "\n";
    
}
