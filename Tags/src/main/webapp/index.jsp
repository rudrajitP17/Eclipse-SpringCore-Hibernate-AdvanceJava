<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
		int a=10; //global value
		String name="Rudra"; //all the variables, methods in this tag are global values
		int square()
		{
			return a*a;
		}
	%>
	<%
		out.println(a);
		out.println(name);
		out.println(square());
		
		int b=3; // all variables in this tag are local values
		for(int i=0;i<b;i++)
			out.println(i);
		// The below tags don't need out.println() for printing purpose.
	%>
	<%= a %>
	<%= name %>
	<%= square() %>
</body>
</html>