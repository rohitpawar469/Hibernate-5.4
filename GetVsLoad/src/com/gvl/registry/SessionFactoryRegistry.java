package com.gvl.registry;

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
			sessionFactory=new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).buildMetadata().buildSessionFactory();	
			
		}

		catch(Throwable e) 
		{
			e.printStackTrace();
			
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory()
	{
		if(sessionFactory!=null);
		{
			sessionFactory.close();
		}
	}
	
	
}
