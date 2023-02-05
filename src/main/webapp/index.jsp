<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shopzz</title>
<h2><center>Shopzz</center></h2>
<style>
body {
    background-image: url("images/background3.jpg");
    no-repeat fixed center;
    text-align:center;
}
</style>
</head>
<center>
<table>
<form action="LoginServlet" >
<table style="margin-top: 9%">
<tr><th><p style="text-align:center;">Name:</th><td><input type="text" Name="n" required></td></tr>
<tr><th><p style="text-align:center;">Password:</th><td><input type="text" Name="p" required></td></tr>
<tr><td><p style="text-align:center;"><input type="submit" ></td></tr>
<tr><th><p style="text-align:center;">Admin Login</th><td><a href="/ShopApplication/AdminLogin.jsp">Admin Login</a></td></tr>
<tr><th><p style="text-align:center;">Register your Account</th><td><a href="/ShopApplication/RegisterShop.jsp">Register</a></td>
<tr><th><p style="text-align:center;">Forgot Password</th><td><a href="/ShopApplication/ForgetPasswordShop.jsp">ForgetPassword</a></td></tr>
<tr><th><p style="text-align:center;">Delete Account</th><td><a href="/ShopApplication/DeleteAccountShop.jsp">DeleteAccount</a></td></tr>
</table></form></center>
</body>
</html>