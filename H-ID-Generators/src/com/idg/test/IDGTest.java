package com.idg.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.idg.entities.FeedBack;
import com.idg.helper.SessionFactoryRegistry;

public class IDGTest 
{
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		FeedBack feedback=null;
		
		try 
		{
			sessionFactory=SessionFactoryRegistry.getOraclesessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			feedback=new FeedBack();
			feedback.setFeedbackName("Nice");
			feedback.setUserName("Rohit");
			feedback.setDescription("Mobile");
			feedback.setProductName("Mi Note 8");
			feedback.setRating(3);
			Object id=session.save(feedback);
			System.out.println("ID :" +id);
			System.out.println(feedback);
			
			flag=true;
		} 
		finally
		{
			if(transaction!=null)
			{
				if(flag)
				{
					transaction.commit();
				}else
				{
					transaction.rollback();
				}
			}
		}
		
		SessionFactoryRegistry.closesessionFactory();
		
		
		
	}

}
