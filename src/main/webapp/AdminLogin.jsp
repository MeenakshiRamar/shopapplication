<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
<style>
body {
    background-image: url("images/plain3.jpg");
    no-repeat fixed center;
    text-align:center;
}
</style>
</head>
<body><table><form action="AdminServlet" >
<table style="margin-top: 15%">
<tr><th>Name:</th><td><input type="text" Name="n"></td></tr>
<tr><th>Password:</th><td><input type="password" Name="p"></td></tr>
<tr><td><p style="text-align:center;"><input type="submit"></td></tr>
</table></form>
</body>
</html>