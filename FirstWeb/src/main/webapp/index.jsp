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
	String errorMessage = (String) request.getAttribute("errorMessage");
	
	%>
	
	<%
		if(errorMessage != null) {
		%>	
		<h2>Welcome <%= errorMessage %></h2>
		<% }%>
		
	
	
	<a href="FirstServlet">click here </a>
	<form action="user?action=login" method="post">
	<label>UserName</label><input type="text" name="username"></input><br><br>
	<label>Password</label><input type="password" name="pwd"></input><br><button type ="Submit">Login</button>
	</form>
	<a href="registration.html"> new user ?? register here</a>
	
</body>
</html>	