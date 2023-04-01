package com.gl.bookshop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.bookshop.service.UserService;
import com.gl.bookshop.to.User;

@WebServlet("/master")
public class MasterController extends HttpServlet {
	
	UserService userService = new UserService();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("insdie Master Controller...");
		
		List<User> users = userService.getAllUsers();
		
		request.setAttribute("users", users);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("master_page.jsp");
		
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
