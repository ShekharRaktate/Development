package com.app.test;

import com.app.domain.Programmer;
import com.app.domain.Project;
import com.app.util.DBUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Client {
	public static void main(String[] args) {
		
		EntityManager manager= DBUtil.getConnection();
		EntityTransaction tx= manager.getTransaction();
		tx.begin();
		Programmer p1=new Programmer(101,"Shekhar",67000);
		Programmer p2=new Programmer(102,"Shekhar",67000);
		Programmer p3=new Programmer(103,"Shekhar",67000);
		Project pro1=new Project(101,"BMS");
		Project pro2=new Project(102,"ERP");
		p1.getProjects().add(pro1);
		p1.getProjects().add(pro2);
		p2.getProjects().add(pro1);
		p3.getProjects().add(pro1);
		p3.getProjects().add(pro2);
		manager.persist(p1);
		manager.persist(p2);
		manager.persist(p3);
		tx.commit();
		manager.close();


	}
}
