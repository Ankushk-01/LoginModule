package com.bean;

import java.sql.Date;
import java.sql.Timestamp;

public class UserProfile {

	int profile_id;
	int user_id;
	int role_id;
	String full_name;
	String phone_number;
	Date date_of_birth;
	Gender gender;
	Timestamp created_at;
	Timestamp updated_at;
	String email;
	String password;
	String cpassword;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	
	public int getProfile_id() {
		return profile_id;
	}
	public void setProfile_id(int profile_id) {
		this.profile_id = profile_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Timestamp getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	
	@Override
	public String toString() {
		return "UserProfile [profile_id=" + profile_id + ", user_id=" + user_id + ", role_id=" + role_id
				+ ", full_name=" + full_name + ", phone_number=" + phone_number + ", date_of_birth=" + date_of_birth
				+ ", gender=" + gender + ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}

	
	
	 
}
