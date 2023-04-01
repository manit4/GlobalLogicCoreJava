<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String registerSuccessMsg = ( String ) request.getAttribute("register_success");
	String errorMessage = ( String ) request.getAttribute("errorMessage");
%>

	<H2>Global Logic BookShop Application</H2>
	
	<%
	if(registerSuccessMsg != null) {
	%>
	<%= registerSuccessMsg %>
	<%} %>
	<%
	if(errorMessage != null) {
	%>
	<%= errorMessage %>
	<%} %>
	<form action="user?action=login" method="post">
	<label>UserName</label><input type="text" name="username"></input><br><br>
	<label>Password</label><input type="password" name="password"></input><br><button type ="Submit">Login</button>
	</form>
	<a href="registration.jsp"> new user ?? register here</a>
	
</body>
</html>	