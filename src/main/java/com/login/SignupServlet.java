package com.login;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Gender;
import com.bean.UserProfile;
import com.dao.UsersDao;

public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UsersDao usersDao = null;   
	
    public SignupServlet() {
        super();
        usersDao = new UsersDao();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Fetch data from the jsp file
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String date = request.getParameter("date");
		System.out.println("date : "+date);
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("password2");
		System.out.println("confirmPassword : "+confirmPassword);
		String gender = request.getParameter("gender");
		String role = request.getParameter("role");
		UserProfile user = new UserProfile();
		user.setCreated_at(Timestamp.from(Instant.now()));
		user.setDate_of_birth(Date.valueOf(date));
		user.setFull_name(name);
		user.setGender(Gender.valueOf(gender.toUpperCase()));
		user.setPhone_number(number);
		user.setUpdated_at(Timestamp.from(Instant.now()));
		user.setEmail(email);
		user.setPassword(password);
		user.setCpassword(confirmPassword);
		user.setRole(role);
		// echo the data passed by the client
		System.out.println("user details: "+user.toString());
		
		// save the data to the database
		Boolean userAdded = usersDao.addUserProfile(user);
//		response.getWriter().println("sucess");
		RequestDispatcher dispathcher = null;
		if(userAdded) {
			request.setAttribute("authorized", true);
			dispathcher = request.getRequestDispatcher("/welcome");
			dispathcher.forward(request, response);
		}
		request.setAttribute("authorized", null);
		dispathcher = request.getRequestDispatcher("error.jsp");
		try {
			dispathcher.forward(request, response);
		}catch(IOException | ServletException e) {
			e.printStackTrace();
		}
		
	}
	
	
//	public UserProfile(int profile_id, int user_id, int role_id, String full_name, String phone_number,
//			Date date_of_birth, Gender gender, Timestamp created_at, Timestamp updated_at)

}
