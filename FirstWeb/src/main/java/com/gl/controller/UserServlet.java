package com.gl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.repository.UserRepository;
import com.gl.service.UserService;
import com.gl.to.User;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UserService service = new UserService();
	
	public UserServlet() {
		System.out.println("Inside User servlet constructor");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("inside post of FirstServlet and I am updating....");

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String completeName = request.getParameter("cName");
		String email = request.getParameter("email");

		System.out.println(username + ", " + password + ", " + completeName + ", " + email);

		User user = new User(username, password, completeName, email);
		
//		UserRepository repository = new UserRepository();
//		repository.save(user);
		
		service.register(user);
		
		PrintWriter writer = response.getWriter();

		writer.println("<html><body>Thanks for Registering with us...</body></html>");
	}

}
