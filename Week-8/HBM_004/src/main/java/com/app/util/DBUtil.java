package com.app.util;

import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;


public class DBUtil {
	public static EntityManager getConnection() {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("user");
	EntityManager manager=factory.createEntityManager();
	return manager;
	}

}
