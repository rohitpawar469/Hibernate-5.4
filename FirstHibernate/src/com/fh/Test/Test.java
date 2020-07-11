package com.fh.Test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.fh.entities.Store;

public class Test {

	public static void main(String[] args) 
	{
	  Configuration configuration=new Configuration().configure();
	  SessionFactory sessionFactory=configuration.buildSessionFactory();
	  Session session=sessionFactory.openSession();
	  Store store=(Store)session.get(Store.class,"5125");
	 System.out.println(store);
	}

}
