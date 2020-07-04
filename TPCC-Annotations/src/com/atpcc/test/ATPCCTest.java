package com.atpcc.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.atpcc.entities.InternationalShipment;
import com.atpcc.entities.Shipment;
import com.atpcc.entities.SpeedShipment;
import com.atpcc.helper.EntityManagerFactoryRegistry;

public class ATPCCTest {

	public static void main(String[] args)
	{
		EntityManagerFactoryRegistry entityManagerFactoryRegistry=null;
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
	
		boolean flag=false;
		Shipment shipment=null;
		SpeedShipment speedShipment=null;
		InternationalShipment internationalShipment=null;

		try 
		{
			entityManagerFactory=EntityManagerFactoryRegistry.getMysqlFactory();
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			// Store 
			// Super Class 
			
			  shipment=new Shipment(); shipment.setSource("Nashik");
			  shipment.setDestination("Mumbai"); shipment.setWeight(90);
			  shipment.setPrice(25000);
			 entityManager.persist(shipment);
			 System.out.println("awbNo " +shipment.getAwbNo());
			
			flag=true;
		} 
		finally
		{
			if(entityTransaction!=null)
			{
				if(flag)
				{
					entityTransaction.commit();
				}
				else {
					entityTransaction.rollback();
				}
				
				entityManager.close();
			}
			
			EntityManagerFactoryRegistry.closeEntityManager();
		}
		
	}

}
