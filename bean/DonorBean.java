package com.organdonation.bean;

public class DonorBean {
	
	private String username;
	private String age;
	private String bloodgp;
	private String mobile;
	private String email;
	private String location;
	private String organ;
	public DonorBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DonorBean(String username, String age, String bloodgp, String mobile, String email, String location,
			String organ) {
		super();
		this.username = username;
		this.age = age;
		this.bloodgp = bloodgp;
		this.mobile = mobile;
		this.email = email;
		this.location = location;
		this.organ = organ;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBloodgp() {
		return bloodgp;
	}
	public void setBloodgp(String bloodgp) {
		this.bloodgp = bloodgp;
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
	public String getOrgan() {
		return organ;
	}
	public void setOrgan(String organ) {
		this.organ = organ;
	}
	@Override
	public String toString() {
		return "DonorBean [username=" + username + ", age=" + age + ", bloodgp=" + bloodgp + ", mobile=" + mobile
				+ ", email=" + email + ", location=" + location + ", organ=" + organ + "]";
	}
	
	
}
