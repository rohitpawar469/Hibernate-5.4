package com.atpcc.helper;

import org.hibernate.SessionFactory;

public class SessionFactoryRegistry {
	public static SessionFactory sessionFactory;

	static {
		try {

		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
			sessionFactory = null;
		}
	}

}
