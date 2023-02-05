<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Product</title>
<style>
body {
    background-image: url("images/plain3.jpg");
    no-repeat fixed center;
    text-align:center;
}
</style>
</head>
<body><table>
<form action="InsertServlet" >
<table style="margin-top: 15%">
<tr><th><p style="text-align:center;">Product Name</th><td><input type="text" Name="n"></td></tr>
<tr><th><p style="text-align:center;">Head Product </th><td><input type="text" Name="h"></td></tr>
<tr><th><p style="text-align:center;">Product Price</th><td><input type="text" Name="p"></td></tr>
<tr><th><p style="text-align:center;">Quantity</th><td><input type="text" Name="q"></td></tr>


<tr><td><p style="text-align:center;"><input type="submit"></td></tr></table>
</body>
</html>