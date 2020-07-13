package com.ft.test;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
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
			
			/*
			 * product=new Product(); product.setProductName("Microwave Owen");
			 * product.setManufacturer("LG"); product.setDescription(" Full Convection");
			 * product.setPrice(45000);
			 * 
			 * feedback=new Feedback(); feedback.setComments("Superb Device");
			 * feedback.setRating(5); feedback.setFeedbackPostedDate(new Date());
			 * feedback.setFeedbackUserName("Sneha"); feedback.setProduct(product);
			 * session.save(feedback);
			 * 
			 * feedback=new Feedback(); feedback.setComments("Poor 360 Degree heating");
			 * feedback.setRating(2); feedback.setFeedbackPostedDate(new Date());
			 * feedback.setFeedbackUserName("Neha"); feedback.setProduct(product);
			 * session.save(feedback);
			 * 
			 * feedback=new Feedback(); feedback.setComments("Not heating MAX tem");
			 * feedback.setRating(3); feedback.setFeedbackPostedDate(new Date());
			 * feedback.setFeedbackUserName("Sharvari"); feedback.setProduct(product);
			 * session.save(feedback);
			 */
			
			/*
			 * product=session.get(Product.class, 5); System.out.println("Product Name :"
			 * +product.getProductName());
			 * 
			 * feedbacks=product.getFeedbacks(); for (Feedback feedback1 : feedbacks) {
			 * System.out.println(feedback1); }
			 */
			
			
			/*
			 * product=session.get(Product.class, 6);
			 * System.out.println("Product Name :"+product.getProductName());
			 */
			
			Query<Product> query=session.createQuery("from Product");
			List<Product> products=query.list();
			for (Product prod : products)
			{
				Set<Feedback> fbs=prod.getFeedbacks();
				for (Feedback fb : fbs)
				{
					System.out.println(fb.getRating());
				}
			}
			
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
