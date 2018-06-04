package com.ck.entity;

public class User {
	String name;
	String password;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{"+"name:" + name + ",password:" + password+"}";
	}

}
