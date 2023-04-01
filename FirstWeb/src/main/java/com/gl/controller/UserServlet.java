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
import javax.servlet.http.HttpSession;

import com.gl.repository.UserRepository;
import com.gl.service.UserService;
import com.gl.to.User;

//@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserService service = new UserService();

	public UserServlet() {
		System.out.println("Inside User servlet constructor");
	}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		String action = request.getParameter("action");
//		String username = request.getParameter("username");
//		String loggedInUser = request.getParameter("loggedIn");
//
//		User user = service.findUserByUsername(loggedInUser);
//		request.setAttribute("userData", user);
//
//		switch (action) {
//
//		case "delete":
//
//			System.out.println("inside delete " + username + ", " + loggedInUser);
//
//			service.delete(username);
//
//			List<User> users = service.findAll();
//
//			request.setAttribute("users", users);
//
//			RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
//			dispatcher.include(request, response);
//			break;
//
//		case "update":
//
//			System.out.println("inside update " + username + ", " + loggedInUser);
//
//			String updatingUser = request.getParameter("username");
//
//			User user1 = service.findUserByUsername(updatingUser);
//
//			request.setAttribute("updatingUser", user1);
//			
//			String loggedInUser1 = request.getParameter("loggedIn");
//
//			User user4 = service.findUserByUsername(loggedInUser);
//			request.setAttribute("userData", user4);
//
//			RequestDispatcher dispatcher1 = request.getRequestDispatcher("update-user.jsp");
//			dispatcher1.include(request, response);
//			break;
//		}
//	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		String username = request.getParameter("username");
		//String loggedInUser = request.getParameter("loggedIn");

		//User user = service.findUserByUsername(loggedInUser);
		//request.setAttribute("userData", user);

		switch (action) {

		case "delete":

			//System.out.println("inside delete " + username + ", " + loggedInUser);

			
//
//			request.setAttribute("users", users);
			HttpSession session = request.getSession(false);
			
//			List<User> sessionUsers = (List<User>) session.getAttribute("users");
//			System.out.println("session data is "+sessionUsers.size());
			
			RequestDispatcher dispatcher = null;
			
			if( session != null) {
				
				service.delete(username);

				List<User> users = service.findAll();
				session.setAttribute("users", users);

				dispatcher = request.getRequestDispatcher("welcome.jsp");
				dispatcher.include(request, response);
			}
			else {
				dispatcher = request.getRequestDispatcher("index.jsp");
				dispatcher.include(request, response);
			}
			
			break;

		case "update":

			//System.out.println("inside update " + username + ", " + loggedInUser);

			String updatingUser = request.getParameter("username");

			User user1 = service.findUserByUsername(updatingUser);

			request.setAttribute("updatingUser", user1);
			
			String loggedInUser1 = request.getParameter("loggedIn");

			//User user4 = service.findUserByUsername(loggedInUser);
			//request.setAttribute("userData", user4);

			RequestDispatcher dispatcher1 = request.getRequestDispatcher("update-user.jsp");
			dispatcher1.include(request, response);
			break;
		}
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		
//		
//		
//		System.out.println("inside post of FirstServlet and I am updating....");
//
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
//		String completeName = request.getParameter("cName");
//		String email = request.getParameter("email");
//
//		System.out.println(username + ", " + password + ", " + completeName + ", " + email);
//
//		User user = new User(username, password, completeName, email);
//		
////		UserRepository repository = new UserRepository();
////		repository.save(user);
//		
//		service.register(user);
//		
//		PrintWriter writer = response.getWriter();
//
//		writer.println("<html><body>Thanks for Registering with us...</body></html>");
//	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		String action = request.getParameter("action");
//
//		switch (action) {
//
//		case "register":
//
//			System.out.println("register case");
//
//			String username = request.getParameter("username");
//			String password = request.getParameter("password");
//			String completeName = request.getParameter("cName");
//			String email = request.getParameter("email");
//
//			System.out.println(username + ", " + password + ", " + completeName + ", " + email);
//
//			User user = new User(username, password, completeName, email);
//
//			service.register(user);
//
//			PrintWriter writer = response.getWriter();
//
//			writer.println("<html><body>Thanks for Registering with us...</body></html>");
//			break;
//
//		case "login":
//
//			System.out.println("login case");
//
//			String username1 = request.getParameter("username");
//			String password1 = request.getParameter("pwd");
//
//			System.out.println(username1 + ", " + password1);
//
//			User user1 = service.login(username1, password1);
//
//			if (user1 != null) {
//				request.setAttribute("userData", user1);
//				List<User> users = service.findAll();
//				request.setAttribute("users", users);
//				RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
//				dispatcher.include(request, response);
//			} else {
//				RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
//				request.setAttribute("errorMessage", "Wrong Credentials, please try again!!");
//				dispatcher.forward(request, response);
//			}
//
//			break;
//
//		case "update":
//
//			String username2 = request.getParameter("username");
//			String completeName2 = request.getParameter("cName");
//			String email2 = request.getParameter("email");
//			String loggedInUser = request.getParameter("loggedIn");
//			
//			System.out.println(completeName2+", "+email2);
//
//			User user3 = service.findUserByUsername(loggedInUser);
//			request.setAttribute("userData", user3);
//
//			User user2 = new User(username2, null, completeName2, email2);
//			
//			System.out.println("inside controller "+username2+", "+user2.getUsername());
//
//			service.update(user2);
//
//			List<User> users = service.findAll();
//
//			request.setAttribute("users", users);
//			
//			List<User> users1 = service.findAll();
//			request.setAttribute("users", users1);
//			RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
//			dispatcher.include(request, response);
//
//			
//		}
//	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		
		System.out.println("I am reading ServletConfig and ServletContext");
		
		String config = getServletConfig().getInitParameter("configdata");
		System.out.println("Config Data is "+config);
		
		String context = getServletContext().getInitParameter("contextdata");
		System.out.println("Context Data from UserServlet is "+context);

		switch (action) {

		case "register":

			System.out.println("register case");

			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String completeName = request.getParameter("cName");
			String email = request.getParameter("email");

			System.out.println(username + ", " + password + ", " + completeName + ", " + email);

			User user = new User(username, password, completeName, email);

			service.register(user);

			PrintWriter writer = response.getWriter();

			writer.println("<html><body>Thanks for Registering with us...</body></html>");
			break;

		case "login":

			System.out.println("login case");

			String username1 = request.getParameter("username");
			String password1 = request.getParameter("pwd");

			System.out.println(username1 + ", " + password1);

			User user1 = service.login(username1, password1);

			if (user1 != null) {
				//request.setAttribute("userData", user1);
				
				HttpSession session =  request.getSession();
				session.setAttribute("userData", user1);
				
				Cookie cookie = new Cookie("username", username1);
				response.addCookie(cookie);
				
				List<User> users = service.findAll();
				//request.setAttribute("users", users);
				session.setAttribute("users", users);
				RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
				dispatcher.include(request, response);
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
				request.setAttribute("errorMessage", "Wrong Credentials, please try again!!");
				dispatcher.forward(request, response);
			}

			break;

		case "update":

			String username2 = request.getParameter("username");
			String completeName2 = request.getParameter("cName");
			String email2 = request.getParameter("email");
			String loggedInUser = request.getParameter("loggedIn");
			
			System.out.println(completeName2+", "+email2);

			User user3 = service.findUserByUsername(loggedInUser);
			request.setAttribute("userData", user3);

			User user2 = new User(username2, null, completeName2, email2);
			
			System.out.println("inside controller "+username2+", "+user2.getUsername());

			service.update(user2);

			List<User> users = service.findAll();

			request.setAttribute("users", users);
			
			List<User> users1 = service.findAll();
			request.setAttribute("users", users1);
			RequestDispatcher dispatcher = request.getRequestDispatcher("welcome.jsp");
			dispatcher.include(request, response);

			
		}
	}
}
