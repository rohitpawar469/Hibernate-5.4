package com.mto.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mto.entities.Challan;
import com.mto.entities.Vehicle;
import com.mto.helper.SessionFactoryRegistry;

public class MTOTest {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory=null;
		Session session=null;
		boolean flag=false;
		Transaction transaction=null;
		Vehicle vehicle=null;
		Challan challan=null;
		
		try 
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			// Store the Objects
			/*
			 * vehicle=new Vehicle(); vehicle.setRegistrationNo("MH 41 Q 2696");
			 * vehicle.setChassisNo("AB123"); vehicle.setModelNo("Activa");
			 * vehicle.setRegistrationDate(new Date()); vehicle.setPrice(95000); int
			 * vehicleNo=(int) session.save(vehicle); System.out.println("vehicle No :"
			 * +vehicleNo);
			 */
			
			
			
			//new state
			/*
			 * challan=new Challan(); challan.setViolationType("Traffic");
			 * challan.setChallanDate(new Date()); challan.setDescription("Tripple Seat");
			 * challan.setAmount(500); challan.setVehicle(vehicle);
			 * 
			 * int challanNo=(int) session.save(challan);
			 * System.out.println("Challan No :"+challanNo );
			 */
			
			session.get(Vehicle.class, 1);
			System.out.println(vehicle);
			System.out.println();
			flag=true;
		} 
		finally
		{
			if(transaction!=null)
			{
				if(flag)
				{
					transaction.commit();
				}
				else
				{
					transaction.rollback();	
				}
				session.close();
				}
			}
		sessionFactory.close();
		}
		

	}


