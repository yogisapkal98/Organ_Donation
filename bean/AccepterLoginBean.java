package com.organdonation.bean;

public class AccepterLoginBean {
	private String username;
	private String password;
	public AccepterLoginBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccepterLoginBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AccepterLoginBean [username=" + username + ", password=" + password + "]";
	}
	
	
}
