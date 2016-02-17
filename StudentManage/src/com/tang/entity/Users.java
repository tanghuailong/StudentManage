package com.tang.entity;

public class Users {

	private int sid;
	private String username;
	private String password;

	public Users() {

	}

	public Users(int sid, String username, String password) {
		
		this.sid = sid;
		this.username = username;
		this.password = password;
	}

	public int getSid() {
		return this.sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
