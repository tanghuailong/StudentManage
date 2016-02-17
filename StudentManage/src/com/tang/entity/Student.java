package com.tang.entity;

import java.util.Date;

public class Student {

	private String sid;
	private String name;
	private String gender;
	private Date birthday;
	private String address;

	public Student() {

	}

	public Student(String sid, String name, String gender, Date birthday,
			String address) {
		super();
		this.sid = sid;
		this.name = name;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sid=" + this.sid + ", name=" + this.name + ", gender="
				+ this.gender + ", birthday=" + this.birthday + ", address="
				+ this.address + "]";
	}

}
