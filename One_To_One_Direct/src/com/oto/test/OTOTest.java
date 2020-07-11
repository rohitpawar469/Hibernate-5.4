package com.oto.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.oto.entities.DeliveryNote;
import com.oto.entities.Parcel;
import com.oto.helper.SessionFactoryRegistry;

public class OTOTest 
{

	public static void main(String[] args) 
	{
		Session session=null;
		SessionFactory sessionFactory=null;
		Transaction transaction=null;
		boolean flag=false;
		Parcel parcel=null;
		DeliveryNote deliveryNote=null;
		try 
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			
			/*
			 * parcel=new Parcel(); parcel.setDescription("Office Chair");
			 * parcel.setSource("Hyderabad"); parcel.setDestination("Malegaon");
			 * parcel.setSenderName("Rohit"); parcel.setReceiverName("Sneha");
			 * parcel.setAmount(10000); session.save(parcel);
			 * 
			 * deliveryNote=new DeliveryNote(); deliveryNote.setDeliveredBy("kartik");
			 * deliveryNote.setDeliveredTo("Sneha"); deliveryNote.setDeliveryDate(new
			 * Date()); deliveryNote.setMobileNo("8796527434");
			 * deliveryNote.setComments("Thanks"); deliveryNote.setParcel(parcel);
			 * session.save(deliveryNote);
			 */
			
			parcel=session.get(Parcel.class, 1);
					System.out.println(parcel);	
			flag= true;
		}
		finally
		{
			if(transaction!=null)
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
