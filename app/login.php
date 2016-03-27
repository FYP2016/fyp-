<?php
require"db_connect.php";
$id = $_POST["id"];
$password = $_POST["password"];
$query = "select * from user where id like '$id' and password like '$password'";
	$result = mysqli_query($con, $query);
	if(mysqli_num_rows($result)>0) {
	echo "login successful";
	session_start();
	$_SESSION['login_user'] = $id;
	}		
	else{
		echo "incorrect id or password";
		die();
	}
	if(isset($id)){
		$sql_query = "INSERT INTO connection(parent)VALUES('$id')";
$result = mysqli_query($con, $sql_query);
	
	}


		
?>