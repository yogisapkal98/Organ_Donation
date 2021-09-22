package com.organdonation.bean;

public class ContactBean {

	private String name;
	private String email;
	private String mobile;
	private String message;
	public ContactBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactBean(String name, String email, String mobile, String message) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.message = message;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ContactBean [name=" + name + ", email=" + email + ", mobile=" + mobile + ", message=" + message + "]";
	}
	
	
	
}
