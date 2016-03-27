<?php
require "db_connect.php";
$sql_query = "INSERT INTO connection(parent)VALUES('$id')";
$result = mysqli_query($con, $sql_query);
?>
