package com.gl.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gl.to.User;

@WebServlet("/InitServlet")
public class InitServlet extends HttpServlet {

	int count;

	public InitServlet() {
		System.out.println("inside contructor of InitServlet");
	}
	
	public void init() {
		System.out.println("inside init");
		count = 10;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Value of count in InitServlet is "+count);
		
		response.setContentType("text/htmll");
		
		User user = new User();    user.setEmail("manit@gmail.com");
		
		PrintWriter pw = response.getWriter();
		
		request.setAttribute("user", user);
		
		int[] nos = {45, 32, 23, 67};
		request.setAttribute("nos", nos);
		
		Cookie[] cookies =  request.getCookies();
		
		if(cookies != null) {
			
			for(int i = 0; i < cookies.length; i++) {
				
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("username")) {
					
					pw.println(cookie.getValue());
				}
			}
		}
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("test.jsp");
//		dispatcher.include(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
	
	public void destroy() {
		System.out.println("inside destroy");
	}
}
