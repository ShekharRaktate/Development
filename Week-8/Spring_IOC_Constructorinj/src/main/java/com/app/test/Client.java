package com.app.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.Marks;
import com.app.beans.Student;

public class Client {
	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("application-context.xml");
		Student s1=factory.getBean("st",Student.class);
		Student s2=factory.getBean("st1",Student.class);
		Marks m=factory.getBean("mk", Marks.class);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(m);
	}
}
