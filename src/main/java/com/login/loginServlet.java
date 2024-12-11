package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UsersDao;

/**
 * Servlet implementation class homeServlet
 */

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	UsersDao usersDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        usersDao = new UsersDao();
    }

    @Override
	public void service( HttpServletRequest request, HttpServletResponse response ) {
    	RequestDispatcher dispathcher;
    	String email = request.getParameter("email");
    	String password = request.getParameter("password");
    	
    	if(isEmpty(email) || isEmpty(password)) {
    		request.setAttribute("error", "Email or password is null");
    		dispathcher = request.getRequestDispatcher("error.jsp");
    		try {
    			dispathcher.forward(request, response);
    		}catch(IOException | ServletException e) {
    			e.printStackTrace();
    		}			
    	}
    	
    	Boolean authorized = usersDao.userAuthernticate(email,password);
    	
    	if(authorized) {
    		try {
    			dispathcher = request.getRequestDispatcher("/welcome");
    			dispathcher.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	
    	
    	
	

    }
    
    public Boolean isEmpty(String value) {
    	if(value == null || value.length() == 0 || value.isEmpty()) return true ;
    	return false;
    }

}
