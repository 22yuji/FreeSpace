package com.example.demo.entity;

public class User {
	private int user_id;
	private String user_name;
	private String account_name;
	private String pass;
	
	public User() {
	}
	public User(String user_name, String account_name, String pass) {
		this.user_name = user_name;
		this.account_name = account_name;
		this.pass = pass;
	}
	
	public void setUserName(String user_name) {
		this.user_name = user_name;
	}
	public String getUserName() {
		return user_name;
	}
	
	public void setAccountName(String account_name) {
		this.account_name = account_name;
	}
	public String getAccountName() {
		return account_name;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
}
