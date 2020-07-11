package com.flc.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.flc.entities.Merchant;
import com.flc.helper.SessionFactoryRegistry;

public class FLCTest 
{
	
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		Merchant merchant=null;
		boolean flag=false;
		try 
		{
			sessionFactory=SessionFactoryRegistry.getsessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			merchant=new Merchant();
			merchant =session.get(Merchant.class, 1);
			System.out.println(merchant);
			Merchant merchant1=new Merchant();
			merchant1=session.get(Merchant.class, 1);
			System.out.println("metchant == merchant1 ??"+(merchant==merchant1));
			/*
			 *  merchant=new Merchant();
			 * merchant.setMerchantNo(1); merchant.setLicenseNo("L15WE49565");
			 * merchant.setMerchantName("Grill Inn"); merchant.setOwnerName("Roohi Pawar");
			 * merchant.setMerchantRegistrationDate(new Date());
			 * merchant.setStatus("Active"); session.save(merchant); flag=true;
			 */
		}
		finally
		{
		
			if(session!=null)
			{
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
		
		SessionFactoryRegistry.closesessionFactory();
		
		
	}
	
	
	
}
