package com.jpa.test;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.jpa.entities.Bill;
import com.jpa.helper.EntitiyManagerFactoryRegistry;

public class JPATest 
{
	public static void main(String[] args) 
	{
		EntityManager entityManager=null;
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction entityTransaction=null;
		boolean flag=false;
		Bill bill=null;
	
		
		try 
		{
			entityManagerFactory=EntitiyManagerFactoryRegistry.getMysqlFactory();
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			bill=new Bill();
			bill.setBillerName("MSEB");
			bill.setCustomerName("Rohit ");
			bill.setBillDate(new Date());
			bill.setBillAmount(2314);
			entityManager.persist(bill);
			System.out.println(bill);
			
			flag=true;
		}
		finally
		{
			
			if(entityTransaction!=null)
				if(flag)
				{
					entityTransaction.commit();
				}
				else
				{
					entityTransaction.rollback();
				}
		}

		EntitiyManagerFactoryRegistry.close();
	}

}
