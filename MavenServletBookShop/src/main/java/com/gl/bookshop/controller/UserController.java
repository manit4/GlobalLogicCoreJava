package com.gl.bookshop.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.bookshop.service.UserService;
import com.gl.bookshop.to.User;

@WebServlet("/user")
public class UserController extends HttpServlet {
	
	UserService service = new UserService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = null;
		
		RequestDispatcher dispatcher = null;

		switch (action) {
		case "register":

			String completeName = request.getParameter("cName");
			String email = request.getParameter("email");
			String role = request.getParameter("role");
			int castedRole = Integer.parseInt(role);

			System.out.println(username + ", " + password + ", " + completeName + ", " + email);

			user = new User(username, password, completeName, email, castedRole);

			service.register(user);

			request.setAttribute("register_success", "Your details have been taken successfully");

			dispatcher = request.getRequestDispatcher("index.jsp");

			dispatcher.forward(request, response);

			break;

		case "login":

			System.out.println(username + ", " + password);
			
			user = service.login(username, password);
			
			if(user != null) {
				
				dispatcher = request.getRequestDispatcher("welcome.jsp");

				dispatcher.forward(request, response);
			}
			else {
				
				request.setAttribute("errorMessage", "Wrong Credentials, please try again!!");
				
				dispatcher = request.getRequestDispatcher("index.jsp");

				dispatcher.forward(request, response);
			}

			break;

		default:
			break;
		}

	}

}
