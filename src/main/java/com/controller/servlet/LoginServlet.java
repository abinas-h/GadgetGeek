package com.controller.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String pass = "abc";
		String emm = "a@b";
		
		
		
		String email = (String)	request.getParameter("email");
		String password	= (String)request.getParameter("password");
		
		int a = 1;
		
			
		if( email == emm) {
			System.out.println("k ho vai ");
		}
		else {
			System.out.println("good");
		}
			
			
			
			
			System.out.println(request.getParameter("email"));
	}

}
