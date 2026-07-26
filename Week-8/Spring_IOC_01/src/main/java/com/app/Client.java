package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
		Welcome wel= (Welcome)ctx.getBean("welcome");
		wel.getMsg();
		
	}

}
 