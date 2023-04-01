package com.gl.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("insdie IndexController");
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) {
			
			for(int i = 0; i < cookies.length; i++) {
				
				String cookieName = cookies[i].getName();
				
				if(cookieName.equals("username")) {
					
					String cookieValue = cookies[i].getValue();
					
					request.setAttribute("cookie", cookieValue);
				}
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
