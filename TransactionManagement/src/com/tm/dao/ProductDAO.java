package com.tm.dao;

import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.tm.entities.Product;
import com.tm.helper.SessionFactoryRegistry;

public class ProductDAO 
{
	SessionFactory sessionFactory;
	Session session;
	Transaction transaction;
	boolean flag=false;
	
	public Product saveProduct(Product product)
	{
		try 
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			product.setProductNo(1216);
			product.setProductName("Television");
			product.setDescription("FULL HD");
			product.setCost(35478);
			product.setManufacturedDate("2020-03-10");
			product.setWarrentyYears("2");
			session.save(product);
			flag=true;
		}
		finally
		{
			if(session!=null)
			{
				if(flag=true)
				{
					transaction.commit();
				}
			}
			else
			{
				transaction.rollback();
			}
	}
		
		return product;
	}

	
}
