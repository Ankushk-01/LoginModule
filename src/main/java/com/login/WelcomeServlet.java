package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public WelcomeServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String authorized = (String)request.getAttribute("authorized");
		System.out.println("authorized : "+authorized);
		RequestDispatcher dispatcher = null;
		if(authorized == null) {
			dispatcher = request.getRequestDispatcher("/login");
			dispatcher.forward(request, response);
		}
		response.getWriter().append("Welcome Page");
	}

}
