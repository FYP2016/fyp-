<?php
require "db_connect.php";
$username =$_POST["username"];
$password =$_POST["password"];
$phone_no =$_POST["phone_no"];
$mysql_qry = "insert into user(username,password,phone_no) values('$username', '$password', '$phone_no')";
//$query = "SELECT * FROM user WHERE id = '{$id}'";
if($con->query($mysql_qry) === TRUE)
{
	echo"insertion successful";
}


?>
