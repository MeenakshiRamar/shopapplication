<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Quantity</title>
<style>
body {
    background-image: url("images/plain3.jpg");
    no-repeat fixed center;
    text-align:center;
}
</style>
</head>
<body><table>
<form action="ListOfProducts">
<tr><th><p style="text-align:center;">Product Name</th><td><input type="text" Name="n" value="<%=request.getParameter("pn")%>"></td></tr>
<tr><th><p style="text-align:center;"> Quantity </th><td><input type="number" Name="q"></td></tr>
<tr><p style="text-align:center;"><td><input type="submit"></td></tr></table>
</form>

</body>
</html>