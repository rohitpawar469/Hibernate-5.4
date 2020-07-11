package com.gvl.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gvl.entities.Person;
import com.gvl.registry.SessionFactoryRegistry;

public class GVLTest {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory=SessionFactoryRegistry.getSessionFactory();
		Session session=sessionFactory.openSession();
		//savePerson(session);
		
		Person person=session.load(Person.class,1 );
		System.out.println("Person Name :"+person.getPersonName());
	}

	public  static void  savePerson(Session session)
	{
		
		Transaction transaction=null;
		boolean flag=false;
		try 
		{
		
			Person person=new Person();
			transaction=session.beginTransaction();
			person.setPersonNo(1);
			person.setPersonName("Rohit");
			person.setAge("29");
			person.setGender("Male");
			person.setMobileNo(985125);
			person.setEmailAddress("rohitpawar@gmail.com");
			person.setCity("Malegaon");
			person.setState("Maharashtra");
			person.setZip(423105);
			person.setCountry("India");
			session.save(person);
			flag=true;
		}
		finally
		{
			if(session!=null)
			{
				if(flag==true)
				{
					transaction.commit();
				}
			}
			else
			{
				transaction.rollback();
			}
			}
		
		
				
		
		
	}
	
}
