package com.idg.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry 
{
	private static SessionFactory mysqlsessionFactory;
	private static SessionFactory oraclesessionFactory;
	
	static
	{
		
		try
		{
			mysqlsessionFactory=new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate-mysql.cfg.xml").build()).buildMetadata().buildSessionFactory();
		
			
			oraclesessionFactory=new  MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate-oracle.cfg.xml").build()).buildMetadata().buildSessionFactory();
			
		}
		catch (Throwable t)
		{
			t.printStackTrace();
			throw t;
		}
		
		
	}

	public static final SessionFactory getMysqlsessionFactory()
	{
		return mysqlsessionFactory;
	}
	
	
	public static final SessionFactory getOraclesessionFactory() {
		return oraclesessionFactory;
	}


	public static void closesessionFactory()
	{
		if(mysqlsessionFactory!=null)
		{
			mysqlsessionFactory.close();
		}
		if(oraclesessionFactory!=null)
		{
			oraclesessionFactory.close();
		}
		
	}
	
}
