package com.mtmm.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtmm.entities.Person;
import com.mtmm.entities.SportsClub;
import com.mtmm.helper.SessionFactoryRegistry;

public class MTMMTest {

	public static void main(String[] args)
	{
	SessionFactory sessionFactory=null;
	Session session=null;
	Transaction transaction=null;
	boolean flag=false;
	Person person=null;
	SportsClub sportsClub=null;
	Map<String, Person> sportsClubMembers=null;
	

	try 
	{
		sessionFactory=SessionFactoryRegistry.getSessionFactory();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
		
		sportsClubMembers=new HashMap<String, Person>();
		
		person=new Person();
		person.setPersonName("Rohit");
		person.setDob(new  Date());
		person.setGender("Male");
		person.setMobileNo("85202258");
		person.setEmailAddress("rohitpawar469gmail.com");
		session.save(person);
		sportsClubMembers.put("CB01", person);
		
		person=new Person();
		person.setPersonName("Roohi");
		person.setDob(new Date());
		person.setGender("Female");
		person.setMobileNo("963147");
		person.setEmailAddress("roohi14nov@gmail.com");
		session.save(person);
		sportsClubMembers.put("CB02", person);
		
		sportsClub=new SportsClub();
		sportsClub.setClubName("Aakrid Sports");
		sportsClub.setChairman("Rupali Sisode");
		sportsClub.setFees(9850);
		sportsClub.setLocation("Surat");
		sportsClub.setMembers(sportsClubMembers);
		
		session.save(sportsClub);
		
		flag=true;
	}
	finally
	{
		if (transaction!=null)
		{
			if (flag) 
			{
				transaction.commit();
			}
			else
			{
				transaction.rollback();
			}
			session.close();
		} 
		SessionFactoryRegistry.closeSessionFactory();
	}
	
	
	}

}
