package com.app.util;

import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;


public class DBUtil {
	 private static EntityManagerFactory factory=Persistence.createEntityManagerFactory("project");
	public static EntityManager getConnection() {
	return factory.createEntityManager();
	
	}

}
