package com;

public class Student {
	public String sid;
	public String course;
	public String name;
	public String phone;
	public Student(){}
	public Student(String sid,String course, String name,String phone) {
		super();
		this.sid = sid;
		this.course=course;
		this.name = name;
		this.phone=phone;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
