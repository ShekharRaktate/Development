package com.app;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import jakarta.transaction.Transaction;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Product product=new Product();
		product.setName("Apple");
		product.setPrice(234.23);
		session.persist(product);
		tx.commit();
		System.out.println("Product saved successfully!");
		session.close();
	} 

}
