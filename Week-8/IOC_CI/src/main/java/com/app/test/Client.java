package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.College;
import com.app.beans.ColorFactory;
import com.app.beans.FruitStore;
import com.app.beans.Person;
import com.app.beans.User;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
		User users=ctx.getBean("user",User.class);
		System.out.println(users);
		Person person=ctx.getBean("person", Person.class);
		System.out.println(person);
		FruitStore fruitStore=ctx.getBean("fruit",FruitStore.class);
		System.out.println(fruitStore);
		ColorFactory factory=ctx.getBean("color",ColorFactory.class);
		System.out.println(factory);
		College college=ctx.getBean("college",College.class);
		System.out.println(college);
	}

}
