package com.tm.test;

import com.tm.dao.ProductDAO;
import com.tm.entities.Product;
import com.tm.helper.SessionFactoryRegistry;

public class TMTest 
{
	public static void main(String[] args) 
	{
		Product product=new Product();
		ProductDAO productDAO=new ProductDAO();
		product=productDAO.saveProduct(product);
		System.out.println(product);
		
		SessionFactoryRegistry.closeSessionFactory();
	}
}
