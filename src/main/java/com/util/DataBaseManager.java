package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseManager {

	String url = "jdbc:mysql://localhost:3306/credentials";
	String username = "root";
	String pass = "Ankush@123";
	Connection con = null;

	public DataBaseManager() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return this.con;
	}
}
