package com.dmlop.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dmlop.entities.Book;
import com.dmlop.helper.SessionFactoryRegistry;

public class DMLUpdate_MergeTest {
	public static void main(String[] args) {

		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		//Book book = null;

		try {

			
			
			
			  sessionFactory = SessionFactoryRegistry.getSessionFactory();
			  session =sessionFactory.openSession();
			  transaction = session.beginTransaction();
			 
			// full update
			/*
			 * book=new Book(); book=session.get(Book.class, 1); book.setTitle("Mehula");
			 * book.setAuthorName("Amish"); book.setPublisherName("History Publications");
			 * book.setPublishDate(new Date()); book.setPrice(125); session.update(book);
			 */
			
			// partial update
			/*
			 * book =new Book(); book=session.get(Book.class, 1);
			 * book.setPublisherName("TATA"); book.setPrice(456); session.update(book);
			 */
			
			
			Book book=session.get(Book.class,2);
			
			Book bookdao=new Book();
			bookdao.setBookNo(2);
			bookdao.setPrice(445);
			bookdao.setTitle(book.getTitle());
			bookdao.setAuthorName(book.getAuthorName());
			bookdao.setPublisherName(book.getPublisherName());
			bookdao.setPublishDate(book.getPublishDate());
			session.merge(bookdao);
			//session.delete(book);
			
			flag = true;
		} finally {

			if (transaction != null)
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}

		}

		SessionFactoryRegistry.closesessionFactory();
	}
}
