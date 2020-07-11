package com.flc.helper;

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
			System.out.println("Getting Session");
			sessionFactory=new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).buildMetadata().buildSessionFactory();
			
			System.out.println("Got the Session");
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			throw t;
		}
	}
	
	
	public static SessionFactory getsessionFactory()
	{
		return sessionFactory;
	}
	
	public static void closesessionFactory()
	{
		if(sessionFactory!=null)
		{
			sessionFactory.close();
		}
	}
}
