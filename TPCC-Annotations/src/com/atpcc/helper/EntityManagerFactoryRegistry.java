package com.atpcc.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryRegistry {
	public static EntityManagerFactory mysqlFactory;

	static {
		try {
			mysqlFactory = Persistence.createEntityManagerFactory("mysqlFactory");
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;

		}

	}

	public static EntityManagerFactory getMysqlFactory() {
		return mysqlFactory;
	}

	public static void closeEntityManager() {
		if (mysqlFactory != null)
		{
	
		}
	}

}
