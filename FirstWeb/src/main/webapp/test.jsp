<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="com.gl.to.User" scope="request"/>
<jsp:getProperty property="email" name="user"/>

${user.email}
${user["email"]}

${ nos[2] }

</body>
</html>