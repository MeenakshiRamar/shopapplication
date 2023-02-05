<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Product</title>
<style>
body {
    background-image: url("images/plain3.jpg");
    no-repeat fixed center;    
}
</style>
</head>
<body>
<table>
<form action="DeleteProductServlet" >
<table style="margin-top: 1%">
<table border="2">
<tr>
<th>Product Name</th>
<th>Product Lead</th>
<th>Product Price</th>
</tr>
	<%
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "Meenakshi@123");
		Statement ps = Con.createStatement();
		String q = "select * from ListOfProduct2";
		ResultSet rs = ps.executeQuery(q);
		while (rs.next()) {
	%>
	<tr>
		<td><%=rs.getString("product")%></td>
		        <td><%=rs.getString("product_lead")%></td>
		        <td><%=rs.getString("product_prize")%></td>
		        <td> <a href="Deletepro1.jsp?pn=<%=rs.getString("product")%>"> delete </a> </td>
	</tr>
	<%
	}
		
	%>
	</table>
	<%
	} catch (ClassNotFoundException e) {
	out.println(e);
	} catch (Exception e) {
	out.println(e);
	}
	%>
</body>
</html>