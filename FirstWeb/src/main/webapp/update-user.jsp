<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.gl.to.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	User updatingUser = (User) request.getAttribute("updatingUser");
	User loggedIn = (User) request.getAttribute("userData");
%>

<h1>Update your details here</h1>
<H2>
		Welcome
		<%= loggedIn.getCompleteName() %></H2>
<form action="user?action=update&loggedIn=<%= loggedIn.getUsername() %>" method="post">
	<label>Username</label>
	<input type="text" name="username" readonly="readonly" value="<%= updatingUser.getUsername()%>"><br><br>
	<label>Complete Name</label>
	<input type="text" name="cName" value="<%= updatingUser.getCompleteName()%>"><br><br>
	<label>Email</label>
	<input type="text" name="email" value="<%= updatingUser.getEmail()%>"><br><br>
	<button>Update</button>
	
</form>
</body>
</html>