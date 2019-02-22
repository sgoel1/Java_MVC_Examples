package com.pojo;

import org.hibernate.validator.constraints.NotEmpty;


public class User {
	@NotEmpty(message="username can't be empty!")
	private String uname;
	@NotEmpty(message="password can't be empty!")
	private String pass;
	public User(){}
	public User(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
