package com.organdonation.bean;

public class DonorRegisterBean {
	
	private String username;
	private String password;
	private String mobile;
	private String email;
	private String location;
	private String country;
	public DonorRegisterBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DonorRegisterBean(String username, String password, String mobile, String email, String location,
			String country) {
		super();
		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.location = location;
		this.country = country;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "DonorRegisterBean [username=" + username + ", password=" + password + ", mobile=" + mobile + ", email="
				+ email + ", location=" + location + ", country=" + country + "]";
	}
	
	
}
