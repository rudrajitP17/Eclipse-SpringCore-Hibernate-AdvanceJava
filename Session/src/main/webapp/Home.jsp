<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String myname=(String) session.getAttribute("name_key");
	%>
	<h3>Welcome : <%= myname %></h3>
	<a href="Profile.jsp">Profile</a>&nbsp;&nbsp;
	<a href="About Us.jsp">About Us</a>&nbsp;&nbsp;
	<a href="Logout">Logout</a>
</body>
</html>