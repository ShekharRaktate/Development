package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
		Student stud= (Student)ctx.getBean("student");
		stud.getId();
		stud.getName();
		stud.getMarks();
		stud.getMobile();
		stud.getAdress();
	
	}

}
 