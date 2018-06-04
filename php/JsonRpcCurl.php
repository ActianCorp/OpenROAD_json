<?php 
$data = array("jsonrpc" => "2.0","id" => 1,"method"=> "subtract","params" => array ("subtrahend" => 23.4 ,"minuend" => 42.8));
$data_string = json_encode($data);

$url = getenv('ORJSON_URL');
$url = $url ? $url . '/jsonrpcservertest' : 'http://localhost:8080/openroad/jsonrpcservertest';

$curl = curl_init($url);

curl_setopt($curl, CURLOPT_CUSTOMREQUEST, "POST");                                                                     
curl_setopt($curl, CURLOPT_POSTFIELDS, $data_string);                                                                  
curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);                                                                      
curl_setopt($curl, CURLOPT_HTTPHEADER, array(                                                                          
    'Content-Type: application/json',                                                                                
    'Content-Length: ' . strlen($data_string))                                                                       
);

$json_response = curl_exec($curl);
$status = curl_getinfo($curl, CURLINFO_HTTP_CODE);

if ( $status != 200 ) {
    die("Error: call to URL $url failed with status $status, response $json_response, curl_error " . curl_error($curl) . ", curl_errno " . curl_errno($curl));
}
curl_close($curl);

print $json_response;
?>