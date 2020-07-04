package com.mtms.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtms.entities.Product;
import com.mtms.entities.Store;
import com.mtms.helper.SessionFactoryRegistry;

public class MTMSTest 
{

	public static void main(String[] args) 
	{
		
		SessionFactory sessionFactory =null;
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		Product product=null;
		Store store=null;
		Set<Product> products=null;
		
		try
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
		
			/*
			 * product=new Product(); products=new HashSet<Product>();
			 * 
			 * product.setDescription("6kg Top Load Washing Machine");
			 * product.setProductName("Washing Machine"); product.setManufacturerName("LG");
			 * product.setWarrentyYears("10"); product.setAmount(25500);
			 * 
			 * session.save(product); products.add(product);
			 * 
			 * 
			 * 
			 * product=new Product();
			 * product.setDescription("5.5kg Front Load Washing Machine");
			 * product.setProductName("Washing Machine");
			 * product.setManufacturerName("Samsung"); product.setWarrentyYears("9");
			 * product.setAmount(22500);
			 * 
			 * session.save(product); products.add(product);
			 * 
			 * store=new Store(); store.setStoreName("Gada Electronics");
			 * store.setMobileNo("86455");
			 * store.setEmailAddress("gadaEl1ectronics@gmail.com");
			 * store.setLocation("Mumbai"); session.save(store);
			 * 
			 * store.setProducts(products);
			 */

			store =new Store();
			store =session.get(Store.class, 1);
			System.out.println(store);
				
			flag=true;
		}
		finally
		{ 
			if (transaction !=null)
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
		}
		
		SessionFactoryRegistry.closeSessionFactory();
		
		
		

	}

}
