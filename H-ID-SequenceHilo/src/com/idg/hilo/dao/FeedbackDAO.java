package com.idg.hilo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.idg.hilo.entities.Feedback;
import com.idg.hilo.helper.SessionFactoryRegistry;

public class FeedbackDAO 
{

public static void saveFeedback(List<Feedback> feedbacks)
{
	
	 SessionFactory sessionFactory=null;
	Session session=null;
	Transaction transaction=null;
	boolean flag=false;
	
	try 
	{
		sessionFactory=SessionFactoryRegistry.getSessionFactory();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		
		for (Feedback feedBack : feedbacks)
		{
			Object id=session.save(feedBack);
			System.out.println(id);
		}
				
		flag=true;
	} finally 
	{
		if(transaction!=null)
			if(flag)
			{
				transaction.commit();
			}
			else
			{
				transaction.rollback();
			}
}

	}




}

	
	
	
	
	

