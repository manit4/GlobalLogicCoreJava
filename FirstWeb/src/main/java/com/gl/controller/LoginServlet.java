package com.gl.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.service.UserService;
import com.gl.to.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	UserService service = new UserService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String config = getServletConfig().getInitParameter("configdata");
		System.out.println("Config Data is "+config);
		
		String context = getServletContext().getInitParameter("contextdata");
		System.out.println("Context Data from LoginServlet is "+context);
		
		Cookie cookie = new Cookie("username", "Manit");
		
		response.addCookie(cookie);
		
		response.getWriter().println("Hello");
		

//		System.out.println("inside doGet of LoginServlet fir delete");
//
//		String username = request.getParameter("username");
//
//		System.out.println("username is " + username);

	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		System.out.println("inside doPost of LoginServlet");
//		
//		String username = request.getParameter("username");
//		String password = request.getParameter("pwd");
//		
//		System.out.println(username+", "+password);
//		
//		User user = service.loginString(username, password);
//		
//		PrintWriter writer = response.getWriter();
//		
//		if(user != null) {
//
//			writer.println("<html><body>Welcome "+username+"</body></html>");
//			
//		}
//		else {
//			writer.println("<!DOCTYPE html>\r\n"
//					+ "<html>\r\n"
//					+ "<head>\r\n"
//					+ "<meta charset=\"ISO-8859-1\">\r\n"
//					+ "<title>Insert title here</title>\r\n"
//					+ "</head>\r\n"
//					+ "<body>\r\n"
//					+ "	<h1 style=\"color: red\">Wrong Credentials</h1>\r\n"
//					+ "	<a href=\"FirstServlet\">click here </a>\r\n"
//					+ "	<form action=\"login\" method=\"post\">\r\n"
//					+ "	<label>UserName</label><input type=\"text\" name=\"username\"></input><br><br>\r\n"
//					+ "	<label>Password</label><input type=\"password\" name=\"pwd\"></input><br><button type =\"Submit\">Login</button>\r\n"
//					+ "	</form>\r\n"
//					+ "	<a href=\"registration.html\"> new user ?? register here</a>\r\n"
//					+ "	\r\n"
//					+ "</body>\r\n"
//					+ "</html>	");
//		}
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println("inside doPost of LoginServlet");
//
//		String username = request.getParameter("username");
//		String password = request.getParameter("pwd");
//
//		System.out.println(username + ", " + password);
//
//		User user = service.login(username, password);
//
//		PrintWriter writer = response.getWriter();
//
//		if (user != null) {
//			request.setAttribute("userData", user);
//			List<User> users = service.findAll();
//			request.setAttribute("users", users);
//			RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
//			dispatcher.include(request, response);
//		} else {
//			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//			request.setAttribute("errorMessage", "Wrong Credentials, please try again!!");
//			dispatcher.forward(request, response);
//		}
	}

}
