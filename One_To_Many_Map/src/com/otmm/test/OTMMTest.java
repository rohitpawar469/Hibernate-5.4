package com.otmm.test;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otmm.entities.Freelancer;
import com.otmm.entities.Project;
import com.otmm.helper.SessionFactoryRegistry;

public class OTMMTest {

	public static void main(String[] args)
	{
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		Project project=null;
		Freelancer freelancer=null;
		Map<String, Project> awardedProjects=null;
		
		try
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			/*
			 * awardedProjects=new HashMap<String, Project>();
			 * 
			 * project=new Project(); project.setProjectName("Billing System");
			 * project.setDuration(36); project.setDomain("Hotel Industry");
			 * project.setAllotedBudget(250000); session.save(project);
			 * awardedProjects.put("AW01",project);
			 * 
			 * 
			 * 
			 * project=new Project(); project.setProjectName("Stock Inventary");
			 * project.setDuration(12); project.setDomain("Warehouse Management");
			 * project.setAllotedBudget(180000); session.save(project);
			 * awardedProjects.put("AW02",project);
			 * 
			 * freelancer=new Freelancer(); freelancer.setFreelancerName("Rohit Pawar");
			 * freelancer.setExperience(3); freelancer.setTechnologies("REST");
			 * freelancer.setAwardedprojects(awardedProjects); session.save(freelancer);
			 */
			
			freelancer=session.get(Freelancer.class, 1);
			System.out.println(freelancer);
			
			flag=true;
		}
		finally
		{
			if (transaction != null)
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
