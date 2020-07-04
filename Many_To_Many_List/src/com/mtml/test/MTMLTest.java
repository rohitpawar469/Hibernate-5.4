package com.mtml.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mtml.entities.Order;
import com.mtml.entities.Product;
import com.mtml.helper.SessionFactoryRegistry;

public class MTMLTest {
	public static void main(String[] args) 
	{
		Session session=null;
		SessionFactory sessionFactory=null;
		Transaction transaction=null;
		boolean flag=false;
		Product product=null;
		Order order=null;
		List<Product> products=null;
		
		
		try
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			/*
			 * products=new ArrayList<Product>();
			 * 
			 * product=new Product(); product.setProductName("Apple iphone 11");
			 * product.setDescription("Mobile Phone"); product.setManufacturerName("Apple");
			 * product.setPrice(150000); session.save(product);
			 * 
			 * products.add(product); product=new Product();
			 * product.setProductName("Apple Airpods");
			 * product.setDescription("Ear Phones"); product.setManufacturerName("Apple");
			 * product.setPrice(15000); session.save(product); products.add(product);
			 * 
			 * order=new Order(); order.setDescription("Retail Order");
			 * order.setOrderedDate(new Date()); order.setCustomerName("Rohit Pawar");
			 * order.setOrderedDate(new Date()); order.setAmount(175000);
			 * 
			 * order.setProducts(products); session.save(order);
			 */
			
			order=session.get(Order.class, 1);
			System.out.println(order);
			
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
