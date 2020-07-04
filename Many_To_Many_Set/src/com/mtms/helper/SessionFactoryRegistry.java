package com.mtms.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry 
{
	public static SessionFactory sessionFactory;
	
	static
	{
		try
		{
			System.out.println("Enter");
			
			sessionFactory=new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).buildMetadata().buildSessionFactory();
			
			System.out.println("Exit");
		}
		catch (Throwable t)
		{
			t.printStackTrace();
			throw t;
			
		}
		
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void closeSessionFactory()
	{
		if(sessionFactory!=null)
		{
			sessionFactory.close();
			sessionFactory=null;
		}
	}
	

}
