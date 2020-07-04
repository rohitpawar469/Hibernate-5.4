package com.atpsc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.atpsc.entities.InternationalShipment;
import com.atpsc.entities.Shipment;
import com.atpsc.entities.SpeedShipment;
import com.atpsc.helper.SessionFactoryRegistry;
import com.mysql.cj.jdbc.BlobFromLocator;

public class TPSCTest {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		Shipment shipment=null;
		SpeedShipment speedShipment=null;
		InternationalShipment internationalShipment=null;
		
		
		try 
		{
		
			// Store 
						// Super Class 
						/*
						 * shipment=new Shipment(); shipment.setSource("Nashik");
						 * shipment.setDestination("Mumbai"); shipment.setWeight(90);
						 * shipment.setPrice(25000);
						 * 
						 * awbNo=(int) session.save(shipment); System.out.println("awbNo :"+awbNo);
						 */
						
						// Sub Class
						/*
						 * speedShipment =new SpeedShipment(); speedShipment.setSource("Malegaon");
						 * speedShipment.setDestination("Delhi"); speedShipment.setWeight(40);
						 * speedShipment.setPrice(28000); speedShipment.setDaysToDeiver(5);
						 * speedShipment.setInstructions("Fragile"); awbNo=(int)
						 * session.save(speedShipment); System.out.println("awbNo "+awbNo);
						 */
								
						
						/*
						 * internationalShipment=new InternationalShipment();
						 * internationalShipment.setSource("Surat");
						 * internationalShipment.setDestination("Dubai");
						 * internationalShipment.setWeight(40); internationalShipment.setPrice(28000);
						 * internationalShipment.setShipmentMode("AirMode");
						 * internationalShipment.setTax(3500); awbNo=(int)
						 * session.save(internationalShipment); System.out.println("awbNo "+awbNo);
						 */
						
						
						// Accessing the Data
						
						// Sub Class
						/*
						 * speedShipment=session.get(SpeedShipment.class, 2);
						 * System.out.println(speedShipment);
						 */
						
						/*
						 * internationalShipment =session.get(InternationalShipment.class, 3);
						 * System.out.println(internationalShipment);
						 */
						
						shipment= session.get(Shipment.class, 2);
						System.out.println(shipment);
						// It suppports Polymorphic Retrival
			
			
			flag=true;
		}
		finally 
		{
			if(transaction!=null)
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
