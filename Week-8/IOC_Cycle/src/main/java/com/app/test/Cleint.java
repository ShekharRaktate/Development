package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.A;
import com.app.beans.B;

public class Cleint {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("application-context.xml");
		A oa=ctx.getBean("a",A.class);
		System.out.println(oa);
		B ob=ctx.getBean("b",B.class);
		System.out.println(ob);
	}
}
