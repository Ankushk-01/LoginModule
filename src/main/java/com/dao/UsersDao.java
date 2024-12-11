package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.util.DataBaseManager;

public class UsersDao {
	
	DataBaseManager db;
	
	public UsersDao(){
		db = new DataBaseManager();
	}
	
	public String getUserdetails(String email,String password) {
		return "";
		
	}

	public Boolean userAuthernticate(String email, String password) {
		Connection con = null;
		
		try {
			con = db.getConnection();
			
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
	
	
}
