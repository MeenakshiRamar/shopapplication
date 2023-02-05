<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<h2><center>Shopzz</center></h2>
<style>
h1 {
text-align:center;
color:Black;
}
.none {
text-decoration: blink;
font-size:20px;
}
body {
    background-image: url("images/plain3.jpg");
    no-repeat fixed center;
    text-align:center;
}
}
</style>
</head>
<body><center>
<h3>Welcome...
<%
String name=(String) session.getAttribute("k");
out.println(name);
%>
</h3>
<table>
<tr><td><a href="/ShopApplication/Dresses.jsp">Dresses</a></td></tr>
<tr><td><a href="/ShopApplication/Shoes.jsp">Shoes</a></td></tr>
<tr><td><a href="/ShopApplication/Electronics.jsp">Electronics</a></td></tr>
<tr><td><a href="/ShopApplication/Grocery.jsp">Grocery</a></td></tr></table></center>
</body>
</html>