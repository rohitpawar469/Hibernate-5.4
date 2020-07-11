package com.jpa.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntitiyManagerFactoryRegistry
{

	private static EntityManagerFactory mysqlFactory; 
	private static EntityManagerFactory oracleFactory;
	
	static
	{
		
		try
		{
			mysqlFactory=Persistence.createEntityManagerFactory("mysql");
			
			//oracleFactory=Persistence.createEntityManagerFactory("oracle");
		} 
		catch (Throwable t)
		{
			t.printStackTrace();
			throw t;
		}
		
	}

	public static final EntityManagerFactory getMysqlFactory() {
		return mysqlFactory;
	}

	public static final EntityManagerFactory getOracleFactory() {
		return oracleFactory;
	}
	
	public static void close()
	{
		if(mysqlFactory!=null)
		{
			mysqlFactory.close();
		}
		if(oracleFactory!=null)
		{
			oracleFactory.close();
		}
	}
	
}
