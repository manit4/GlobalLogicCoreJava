package com.gl.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
	
	public void destroy() {
		System.out.println("inside destroy");
	}
}
