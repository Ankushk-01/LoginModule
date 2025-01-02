package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.UserProfile;
import com.util.DataBaseManager;

public class UsersDao {

	DataBaseManager db;
	Connection con;

	public UsersDao() {
		db = new DataBaseManager();
		try {
			con = db.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getUserdetails(String email, String password) {
		return "";

	}

	public Boolean userAuthernticate(String email, String password) {
		int result = getUserId(email, password);
		return result > 0 ? true : false;
	}

	public Boolean addUser(UserProfile user) {
		try {
			String query = "INSERT INTO users (user_name,email,password,status) VALUES (?,?,?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, user.getFull_name());
			stmt.setString(2, user.getEmail());
			stmt.setString(3, user.getPassword());
			stmt.setString(4, "panding");

			int result = stmt.executeUpdate();
			if (result > 0)
				return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	private Boolean addUserRole(int user_id, String role) {
		if (role == null) {
			role = "user";
		}
		try {
			String query = "INSERT INTO roles (user_id,role_name) VALUES (?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, user_id);
			stmt.setString(2, role);
			int result = stmt.executeUpdate();
			if (result > 0)
				return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}

	public Boolean addUserProfile(UserProfile user) {

		Boolean userAdded = addUser(user); // add the user in the database
		int userId = 0;
		int roleId = 0;
		if (userAdded) {
			userId = getUserId(user.getEmail(), user.getPassword());
			System.out.println("user id : " + userId);
		} else {
			return false;
		}

		Boolean roleAdded = addUserRole(userId, user.getRole());
		if (roleAdded) {
			roleId = getRoleId(userId); // role of the user is stored
			System.out.println("role id : " + roleId);
		} else {
			return false;
		}
		try {
			String query = "INSERT INTO user_profiles (user_id, role_id,"
					+ "full_name, phone_number, date_of_birth, gender, created_at, updated_at, email, password, cpassword) VALUES (?,?,?,?,?,?,?,?,?,?,?);";

			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, userId);
			stmt.setInt(2, roleId);
			stmt.setString(3, user.getFull_name());
			stmt.setString(4, user.getPhone_number());
			stmt.setDate(5, user.getDate_of_birth());
			stmt.setString(6, user.getGender().getValue());
			stmt.setTimestamp(7, user.getCreated_at());
			stmt.setTimestamp(8, user.getUpdated_at());
			stmt.setString(9, user.getEmail());
			stmt.setString(10, user.getPassword());
			stmt.setString(11, user.getCpassword());
			System.out.println("query : " + stmt.toString());
			int result = stmt.executeUpdate();
			if (result > 0)
				return true;
		} catch (Exception e) {
			removeUserRole(roleId);
			removeUser(userId);
			e.printStackTrace();
			return false;
		}
		return false;
	}

	private void removeUserRole(int roleId) {
		String query = "DELETE FROM roles WHERE role_id = ?;";

		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, roleId);
			stmt.executeUpdate();
			System.out.println("role deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void removeUser(int userId) {

		String query = "DELETE FROM users WHERE user_id = ?;";

		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, userId);
			stmt.executeUpdate();
			System.out.println("user deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private int getRoleId(int userId) {
		int role_id = 0;
		try {
			String query = "SELECT role_id FROM roles WHERE user_id = ? ;";

			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, userId);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				role_id = result.getInt("role_id");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return role_id;
		}
		return role_id;
	}

	private int getUserId(String email, String password) {
		int user_id = 0;
		try {
			String query = "SELECT user_id FROM users WHERE email = ? AND password = ? ;";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, email);
			stmt.setString(2, password);

			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				user_id = result.getInt("user_id");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return user_id;
		}
		return user_id;
	}

}
