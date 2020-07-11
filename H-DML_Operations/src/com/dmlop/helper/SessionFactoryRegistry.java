package com.dmlop.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionFactoryRegistry {
	private static SessionFactory sessionFactory;

	static {
		try {
			
			Configuration configuration=new Configuration().configure();
			sessionFactory=configuration.buildSessionFactory();
			
			//sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure().build())
				//	.buildMetadata().buildSessionFactory();
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
			sessionFactory = null;
		}
	}

}
