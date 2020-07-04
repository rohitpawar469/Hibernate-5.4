package com.tpch.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mysql.cj.jdbc.BlobFromLocator;
import com.tpch.entities.ChequePayment;
import com.tpch.entities.DigitalPayment;
import com.tpch.entities.Payment;
import com.tpch.helper.SessionFactoryRegistry;

public class TPCHTest 
{
	public static void main(String[] args) {
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		Payment payment=null;
		ChequePayment chequePayment=null;
		DigitalPayment digitalPayment=null;		
				
		
		try 
		{
			
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			/*
			 * payment=new Payment(); payment.setPaymentDate(new Date());
			 * payment.setDescription("Goods Purchsed"); payment.setAmount(15544);
			 * session.save(payment); Object id=session.get(Payment.class, 1);
			 * System.out.println(id);
			 */
			 
			 
			
			/*
			 * chequePayment=new ChequePayment(); chequePayment.setPaymentDate(new Date());
			 * chequePayment.setDescription("Items purchased");
			 * chequePayment.setAmount(124774); chequePayment.setChequeNo("CH1245");
			 * chequePayment.setChequeIssuedDate(new Date());
			 * chequePayment.setBankName("ICICI Bank");
			 * chequePayment.setBranchName("Ameerpet");
			 * chequePayment.setIfscCode("ICICI1554");
			 * 
			 * Object id=session.get(ChequePayment.class,2); System.out.println(id);
			 */
			
			
			  digitalPayment=new DigitalPayment(); digitalPayment.setPaymentDate(new
			  Date()); digitalPayment.setDescription("Renuka Foods");
			  digitalPayment.setAmount(45744); digitalPayment.setDigitalPaymentNo("D123");
			  digitalPayment.setTxNo("T1212"); digitalPayment.setCreditedDate(new Date());
			  digitalPayment.setPartnerName("Gpay");
			  digitalPayment.setRemarks("Some Goods"); 
			  
			  Object id=session.get(DigitalPayment.class,3);
			  System.out.println(id);
			
			flag=true;
		}
		finally
		{
			if(transaction!=null)
				if(flag)
				{
					
					transaction.commit();
				}
			else
			{
				transaction.rollback();
			}
		}
		
		SessionFactoryRegistry.closeSessionFactory();
		
		
	}
}
