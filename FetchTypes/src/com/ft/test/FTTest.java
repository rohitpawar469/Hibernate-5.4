package com.ft.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ft.entities.Feedback;
import com.ft.entities.Product;
import com.ft.helper.SessionFactoryRegistry;
import com.sun.xml.fastinfoset.sax.Properties;

public class FTTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Product product=null;
		Feedback feedback=null;
		Set<Feedback> feedbacks=null;
		
		try 
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			feedbacks=new HashSet<>();
			
			product=new Product();
			product.setProductName("Microwave Owen");
			product.setManufacturer("LG");
			product.setDescription(" Full Convection");
			product.setPrice(45000);

			feedback=new Feedback();
			feedback.setComments("Superb Device");
			feedback.setRating(5);
			feedback.setFeedbackPostedDate(new Date());
			feedback.setFeedbackUserName("Sneha");
			feedback.setProduct(product);
			session.save(feedback);
			
			feedback=new Feedback();
			feedback.setComments("Poor 360 Degree heating");
			feedback.setRating(2);
			feedback.setFeedbackPostedDate(new Date());
			feedback.setFeedbackUserName("Neha");
			feedback.setProduct(product);
			session.save(feedback);
			
			feedback=new Feedback();
			feedback.setComments("Not heating MAX tem");
			feedback.setRating(3);
			feedback.setFeedbackPostedDate(new Date());
			feedback.setFeedbackUserName("Sharvari");
			feedback.setProduct(product);
			session.save(feedback);
			
		
			
			flag=true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactory();
		}

	}

}
