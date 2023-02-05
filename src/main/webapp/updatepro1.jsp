<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update product</title>
<style>
body {
    background-image: url("images/plain3.jpg");
    no-repeat fixed center;
    text-align:center;
}
</style>
</head>
<body>
<table>
<form action="UpdateProduct">
<tr><th><p style="text-align:center;">Product Name</th><td><input type="text" Name="n" value="<%=request.getParameter("pn")%>"></td></tr>
<tr><th><p style="text-align:center;">Head Product </th><td><input type="text" Name="h" value="<%=request.getParameter("ph")%>"></td></tr>
<tr><th><p style="text-align:center;">Product Prize</th><td><input type="text" Name="p" value="<%=request.getParameter("pp")%>"></td></tr>
<tr><td><p style="text-align:center;"><input type="submit"></td></tr></form></table>
</body>
</html>