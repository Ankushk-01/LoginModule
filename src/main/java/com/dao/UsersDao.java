package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.bean.UserProfile;
import com.util.DataBaseManager;

public class UsersDao {
	
	DataBaseManager db;
	Connection con;
	public UsersDao(){
		db = new DataBaseManager();
		try {
			con = db.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String getUserdetails(String email,String password) {
		return "";
		
	}

	public Boolean userAuthernticate(String email, String password) {
		try {
			String query = "SELECT * FROM users WHERE email = ? AND password = ? ;";
			
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, email);
			stmt.setString(2, password);
			
			ResultSet result = stmt.executeQuery();
			
			if(result.next()) {
				return true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	
		return false;
	}
	
	public Boolean addUser(UserProfile user) {
		try {
			String query = "INERT INTO users (user_name,email,password,status) 	VALUES (?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, user.getFull_name());
			stmt.setString(2, user.getEmail());
			stmt.setString(3, user.getPassword());
			stmt.setString(4, "panding");
			
			int result = stmt.executeUpdate();
			if(result >0)return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Boolean addUserProfile(UserProfile user) {
		
		Boolean userAdded = addUser(user);
		long userId = 0;
		if(userAdded) {
			userId = getUserId(user.getEmail(),user.getPassword());
		}else {
			return false;
		}
		
		Boolean roleAdded = addUserRole(userId,"user");
		if()
		return false;
	}

	private long getUserId(String email, String password) {
		long user_id = 0;
		try {
			String query = "SELECT user_id FROM users WHERE email = ? AND password = ? ;";
			
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, email);
			stmt.setString(2, password);
			
			ResultSet result = stmt.executeQuery();
			result.next();
			if(result.next()) {
				user_id = result.getLong(1);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			return user_id;
		}
		return user_id;
	}

	private Boolean addUserRole(long user_id,String role) {
		
		return null;
	}
	
	
}
