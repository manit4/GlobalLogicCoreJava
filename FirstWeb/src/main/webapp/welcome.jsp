<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.gl.to.User, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>

	<%
	/* User user = (User) request.getAttribute("userData");
	List<User> users = (List<User>) request.getAttribute("users"); */
	
	/* User user = (User) session.getAttribute("userData"); */
	List<User> users = (List<User>) session.getAttribute("users");
	
	
%>
<h1>I am using Jsp Standard Action tag</h1>
<%-- <jsp:useBean id="userData" class="com.gl.to.User" scope="session"/>
<jsp:getProperty property="completeName" name="userData"/> --%>


<H2>I am using EL(Expression Tag)</H2>

${userData.getCompleteName() }

${ users.get(5).getCompleteName() }

	<H2>
		Welcome
		<%-- <%= userData.getCompleteName() %> --%></H2>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Username</th>
				<th scope="col">Complete Name</th>
				<th scope="col">Email</th>
				<th scope="col">Delete</th>
				<th scope="col">Update</th>
			</tr>
		</thead>
		<tbody>
			<%
  for(int i = 0; i < users.size(); i++) {
  %>
			<tr>
				<th scope="row"><%= i+1 %></th>
				<td><%= users.get(i).getUsername() %></td>
				<td><%= users.get(i).getCompleteName() %></td>
				<td><%= users.get(i).getEmail() %></td>
				<%-- <td><a href="user?action=delete&username=<%= users.get(i).getUsername()%>&loggedIn=<%= user.getUsername() %>">delete</a></td>
				<td><a href="user?action=update&username=<%= users.get(i).getUsername()%>&loggedIn=<%= user.getUsername() %>">update</a></td> --%>
				
				<td><a href="user?action=delete&username=<%= users.get(i).getUsername()%>">delete</a></td>
				<td><a href="user?action=update&username=<%= users.get(i).getUsername()%>">update</a></td>
				
			</tr>
			<%} %>

		</tbody>
	</table>
	
	<c:forEach var="i" begin="0" end="${users.size() }">
		<c:out value="${ users.get(${i})}"></c:out>
	</c:forEach>
	
</body>
</html>