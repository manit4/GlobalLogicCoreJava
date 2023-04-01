<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Shop Application</title>
</head>
<body>

<H2>Global Logic BookShop Application</H2>
<h1>Provide your details here</h1>
<form action="user?action=register" method="post">
	<label>Username</label>
	<input type="text" name="username"><br><br>
	<label>Password</label>
	<input type="password" name="password"><br><br>
	<label>Complete Name</label>
	<input type="text" name="cName"><br><br>
	<label>Email</label>
	<input type="text" name="email"><br>
	Customer:<input type="radio" name = "role" value="0">
	Admin:<input type="radio" name = "role" value="1">
	<br><button>Register</button>
	
</form>
</body>
</html>