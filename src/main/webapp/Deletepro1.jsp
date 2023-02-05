<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete product</title>
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
<form action="DeleteProductServlet">
<tr><th><p style="text-align:center;">Product Name</th><td><input type="text" Name="n" value="<%=request.getParameter("pn")%>"></td></tr>

<tr><td><p style="text-align:center;"><input type="submit"></td></tr></form></table>
</table></body>
</html>