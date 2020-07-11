package com.otml.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otml.entities.Applicant;
import com.otml.entities.WelfareScheme;
import com.otml.helper.SessionFactoryRegistry;

public class OTMLTest {

	public static void main(String[] args) 
	{
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		Applicant applicant=null;
		WelfareScheme welfareScheme=null;
		List<Applicant> applicants=null;
		
		int applicantNo=0;
		
		
		try 
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			applicants=new ArrayList<Applicant>();
			applicant=new Applicant();
			applicant.setApplicantName("Rohit");
			applicant.setDob(new Date());
			applicant.setGender("Male");
			applicant.setMobileNo("8796527434");
			applicant.setAadharNo("adhar123456");
			
			applicantNo=(int)session.save(applicant);
			System.out.println("applicantNo : " +applicantNo);
			
			applicants.add(applicant);
			
			applicant=new Applicant();
			applicant.setApplicantName("Roohi");
			applicant.setDob(new Date());
			applicant.setGender("Female");
			applicant.setMobileNo("8108056946");
			applicant.setAadharNo("adhar321654");
			
			applicantNo=(int) session.save(applicant);
			System.out.println("applicantNo : " +applicantNo );
			applicants.add(applicant);
			
			welfareScheme =new WelfareScheme();
			welfareScheme.setSchemeName("PM Aavas Yojna");
			welfareScheme.setCategory("Housing");
			welfareScheme.setCriteria("First Home");
			welfareScheme.setDuration(12);
			welfareScheme.setLaunchedDate(new Date());
			welfareScheme.setApplicants(applicants);
			
			int schemeNo =(int) session.save(welfareScheme);
			System.out.println("schemeNo :" +schemeNo);
			
			
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
				SessionFactoryRegistry.CloseSessionFactory();
		

	}

}
