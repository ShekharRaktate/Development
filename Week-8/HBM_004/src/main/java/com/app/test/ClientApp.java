package com.app.test;
import com.app.domain.User;
//jpa

import java.util.Set;
import java.util.HashSet;


import com.app.domain.PhoneNumber;
import com.app.util.DBUtil;

import jakarta.persistence.*;
public class ClientApp {
	public static void main(String[] args) {
		EntityManager manager= DBUtil.getConnection();
		EntityTransaction tx= manager.getTransaction();
		tx.begin();
		User user=new User();
		user.setFirstname("Shekhar");
		user.setuId(121);
		
		PhoneNumber p1=new PhoneNumber();
		p1.setPhone(1234567890L);
		p1.setNumber_type("HOME");
		PhoneNumber p2=new PhoneNumber();
		p2.setPhone(2323232333L);
		p2.setNumber_type("office");
		
		Set<PhoneNumber> phones=new HashSet<>();
		phones.add(p1);
		phones.add(p2);
		user.setPhones(phones);
		
		manager.persist(user);
		tx.commit();
		manager.close();
	}
}
