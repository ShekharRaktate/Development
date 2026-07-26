package com.app;

public class Student {
	private int id;
	private String name;
	private long mobile;
	private double marks;
	private String address;
	public void getId() {
		System.out.println(id);
	}
	public void setId(int id) {
		this.id = id;
	}
	public void getName() {
		System.out.println(name);;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getMobile() {
		System.out.println(mobile);;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public void getMarks() {
		System.out.println(marks);;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public void getAdress() {
		System.out.println(address);
	}
	public void setAdress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", marks=" + marks + ", adress=" + address
				+ "]";
	}
	
	
}
