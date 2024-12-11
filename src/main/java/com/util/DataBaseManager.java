package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseManager {

	String url = "jdbc:mysql://localhost:3306";
	String username = "root";
	String pass = "Ankush@123";
	Connection con = null;

	DataBaseManager() {
		try {
			con = DriverManager.getConnection(url, username, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return this.con;
	}
}
