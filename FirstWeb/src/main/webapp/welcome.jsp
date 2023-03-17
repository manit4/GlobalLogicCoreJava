<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.gl.to.User, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	User user = (User) request.getAttribute("userData");
	List<User> users = (List<User>) request.getAttribute("users");
%>
<H2>Welcome <%= user.getCompleteName() %></H2>

<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Username</th>
      <th scope="col">Complete Name</th>
      <th scope="col">Email</th>
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
    </tr>
    <%} %>
    
  </tbody>
</table>
</body>
</html>