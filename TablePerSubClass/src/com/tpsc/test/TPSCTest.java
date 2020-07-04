package com.tpsc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpsc.entities.AccidentalInsurancePlan;
import com.tpsc.entities.InsurancePlan;
import com.tpsc.entities.MedicalInsurancePlan;
import com.tpsc.helper.SessionFactoryRegistry;

public class TPSCTest {

	public static void main(String[] args) 
	{

		int planNo=0;
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		InsurancePlan insurancePlan=null;
		AccidentalInsurancePlan accidentalInsurancePlan=null;
		MedicalInsurancePlan medicalInsurancePlan=null;
		
		try
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			//Store Data 
			// SuperClass Object
			/*
			 * insurancePlan=new InsurancePlan();
			 * insurancePlan.setPlanName("Jeevan Tarang"); insurancePlan.setMinTenure(48);
			 * insurancePlan.setMaxTenure(120); insurancePlan.setMinAge(18);
			 * insurancePlan.setMaxAge(58); insurancePlan.setMinInsurredAmount(1000000);
			 * insurancePlan.setMaxInsurredAmount(2500000); session.save(insurancePlan);
			 */
			
			
			//Store Subclass Object 
			/*
			 * accidentalInsurancePlan =new AccidentalInsurancePlan();
			 * accidentalInsurancePlan.setPlanName("Jeevan kishor");
			 * accidentalInsurancePlan.setMinTenure(15);
			 * accidentalInsurancePlan.setMaxTenure(90);
			 * accidentalInsurancePlan.setMinAge(8); accidentalInsurancePlan.setMaxAge(65);
			 * accidentalInsurancePlan.setMinInsurredAmount(500000);
			 * accidentalInsurancePlan.setMaxInsurredAmount(1000000);
			 * accidentalInsurancePlan.setCoverageType("Third-Party");
			 * accidentalInsurancePlan.setInternationalCoverage(true);
			 * accidentalInsurancePlan.setTravelType("Air");
			 * session.save(accidentalInsurancePlan);
			 */
			
		
			/*
			 * medicalInsurancePlan =new MedicalInsurancePlan();
			 * medicalInsurancePlan.setPlanName("Jeevan Jyothi");
			 * medicalInsurancePlan.setMinTenure(18);
			 * medicalInsurancePlan.setMaxTenure(160); medicalInsurancePlan.setMinAge(1);
			 * medicalInsurancePlan.setMaxAge(99);
			 * medicalInsurancePlan.setMinInsurredAmount(5000000);
			 * medicalInsurancePlan.setMaxInsurredAmount(10000000);
			 * medicalInsurancePlan.setCopay(133);
			 * medicalInsurancePlan.setNetworkType("Fast tag");
			 * medicalInsurancePlan.setCashlessFacilityAvailable(true); planNo=(int)
			 * session.save(medicalInsurancePlan); System.out.println("planNo" +planNo);
			 */
			
			// accessing the data
			insurancePlan=new InsurancePlan();
			insurancePlan=session.get(InsurancePlan.class, 2);
			System.out.println(insurancePlan);
			
			
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
