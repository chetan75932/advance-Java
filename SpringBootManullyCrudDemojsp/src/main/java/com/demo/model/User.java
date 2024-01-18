package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;


public class User
{
	private String User_name;
	private String Password;
	private String role;
	public User() {
		super();
	}
	public User(String user_name, String password, String role) {
		super();
		User_name = user_name;
		Password = password;
		this.role = role;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [User_name=" + User_name + ", Password=" + Password + ", role=" + role + "]";
	}
	
	
	
	
}
