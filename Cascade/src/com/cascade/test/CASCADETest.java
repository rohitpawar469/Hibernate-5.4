package com.cascade.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.hql.internal.ast.util.SessionFactoryHelper;

import com.cascade.entities.Complaint;
import com.cascade.entities.Csr;
import com.cascade.helper.SessionFactoryRegistry;

public class CASCADETest {

	public static void main(String[] args)
	{
		SessionFactory sessionFactory=null;
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		Complaint complaint=null;
		Csr csr=null;
		Set<Complaint> assignedComplaints=null;
		
		try
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			
			  assignedComplaints=new HashSet<>();
			  
			  complaint=new Complaint();
			  
			/*
			 * complaint.setTitle("Phone not switching on");
			 * complaint.setDescription("Not Working"); complaint.setPriority(1);
			 * complaint.setSeverity(1); complaint.setReportedDate(new Date());
			 * complaint.setStatus("open");
			 * 
			 * // without cascade save-update we should save the compliant
			 * 
			 * assignedComplaints.add(complaint);
			 * 
			 * complaint.setTitle("Screen Damaged");
			 * complaint.setDescription("Physical Damaged"); complaint.setPriority(2);
			 * complaint.setSeverity(3); complaint.setReportedDate(new Date());
			 * complaint.setStatus("open");
			 * 
			 * assignedComplaints.add(complaint);
			 * 
			 * csr=new Csr();
			 * 
			 * csr.setFullName("Jitesh Sonar"); csr.setDesignation("Junior");
			 * csr.setExperience(2); csr.setMobileNo("123456");
			 * csr.setAssignedComplaints(assignedComplaints); session.save(csr);
			 */
			 
			
			csr=session.get(Csr.class, 1);
			complaint=new Complaint();
			complaint.setTitle("SIgnal Drop");
			complaint.setDescription("");
			complaint.setPriority(9);
			complaint.setSeverity(8);
			complaint.setReportedDate(new Date());
			complaint.setStatus("urgent");
			csr.getAssignedComplaints().add(complaint);
			session.update(csr);
			
			
			
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
