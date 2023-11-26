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
		request.setAttribute("key_name", "Rudrajit");
		out.print(request.getAttribute("key_name"));
	%>
	<h3>Hello : ${requestScope.key_name}</h3>
	<%
		session.setAttribute("key_name1", "Podder");
		out.print(session.getAttribute("key_name1"));
	%>
	<h3>${key_name1}</h3>
	${10+25}
	<form action="Output.jsp" method="post">
		<input type="text" name="name1" placeholder="Name"/><br/><br/>
		<input type="Submit" value="Search" />
	</form>
</body>
</html>