package com.app.beans;

public class B {
	private A a;
	public void setA(A a) {
		this.a=a;
		
	}
	
	public B(A a) {
		System.out.println("A:1 parameter constructor");
		this.a = a;
	}

	public B() {
		System.out.println("A:0 parameter constructor");
		// TODO Auto-generated constructor stub
	}
}
