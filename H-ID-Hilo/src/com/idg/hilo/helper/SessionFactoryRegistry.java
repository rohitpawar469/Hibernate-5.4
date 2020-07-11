package com.idg.hilo.helper;

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {

	private static SessionFactory sessionFactory;

	static {

		Configuration configuration = new Configuration().configure("hibernate-oracle.cfg.xml");
		try {

			sessionFactory = configuration.buildSessionFactory();

		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}

	}

	public static final SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closesessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}

}
