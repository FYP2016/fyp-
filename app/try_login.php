<?php
require "db_connect.php";
 
$username = $_POST["username"];
$password = $_POST["password"];
 
//$name = "sdf";
//$password = "sdf";
 
$sql = "SELECT * FROM `` WHERE `username`='".$username."' AND `password`='".$password."';";
 
$result = mysqli_query($con, $sql);
 
$response = array();
 
while($row = mysqli_fetch_array($result)){
    $response = array("username"=>$row[1],"password"=>$row[2]);
}

echo json_encode(array("user_data"=>$response));
 
?>