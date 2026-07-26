package com.app.beans;

import java.beans.ConstructorProperties;

public class Student {
	private int sno;
	private String sname;
	private float savg;
	@ConstructorProperties(value= {"no","name","avg"})
	public Student(int no, String name, float avg) {
		System.out.println("Student : 3 parameter consturctor");
		this.sno = no;
		this.sname = name;
		this.savg = avg;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", savg=" + savg + "]";
	}
	
	
}
