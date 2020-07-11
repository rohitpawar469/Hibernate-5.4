package com.dmlop.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dmlop.entities.Book;
import com.dmlop.helper.SessionFactoryRegistry;

public class DMLSave_UpdateTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Book book = null;

		try {

			sessionFactory = SessionFactoryRegistry.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			// Update full
			book = new Book();
			book = session.get(Book.class, 1);
			book.setAuthorName("Rohit");
			book.setPrice(350);
			session.saveOrUpdate(book);

			// Save Method
			/*
			 * book = new Book(); book.setTitle("Sita"); book.setAuthorName("Amish");
			 * book.setPublisherName("History Publications"); book.setPublishDate(new
			 * Date()); book.setPrice(390);
			 */

			// Save Method
			// Object id=session.save(book);
			// System.out.println("ID :" +id);

			// Persist Method
			// session.persist(book);
			// session.flush();

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
