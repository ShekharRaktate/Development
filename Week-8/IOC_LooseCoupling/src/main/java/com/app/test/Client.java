package com.app.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.FlipKart;

public class Client {
	public static void main(String[] args) {
		BeanFactory factory= new ClassPathXmlApplicationContext("application-context.xml");
		FlipKart fk=factory.getBean("flipKart",FlipKart.class);
		String res=fk.shopping(new String[] {"Laptop","Mouse","KeyBoard"});
		System.out.println(res);
	}
}
