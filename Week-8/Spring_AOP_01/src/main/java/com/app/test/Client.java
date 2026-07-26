package com.app.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.service.LoanCalculator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory fact=new ClassPathXmlApplicationContext("application-context.xml");
		LoanCalculator cl=fact.getBean("proxy",LoanCalculator.class);
		System.out.println("Proxy Object Name: "+cl.getClass());
		float intrAmt=cl.calculateInterestRateAmt(10000, 4, 24);
		System.out.println("Interest amount is : "+intrAmt);
		System.out.println("---------------------------------");
		float intrAmt1=cl.calculateInterestRateAmt(100000, 4, 24);
		System.out.println("Interest amount is : "+intrAmt1);
	}

}
