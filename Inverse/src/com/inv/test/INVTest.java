package com.inv.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.inv.entities.Branch;
import com.inv.entities.Staff;
import com.inv.helper.SessionFactoryRegistry;

public class INVTest 
{
	public static void main(String[] args) {
		SessionFactory sessionFactory =null;
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		Staff staff=null;
		Branch branch=null;
		Set<Staff> staffSet=null;
		
		try
		{
			sessionFactory=SessionFactoryRegistry.getSessionFactory();
			session=sessionFactory.openSession();
			transaction=session.beginTransaction();
			
			staffSet=new HashSet<>();
			
			branch=new Branch();
			branch.setBranchName("Camp Branch");
			branch.setContactNo("1315468");
			branch.setEmailAddress("contactus@manapuram.com");
			branch.setLocation("Malegaon");
			branch.setOrganisationName("Manapuram Gold Loans");
			
			staff=new Staff();
			staff.setFullName("Rohit Pawar");
			staff.setGender("Male");
			staff.setMobileNo("89565323");
			staff.setAge(29);
			staff.setBranch(branch);
			
			staff=new Staff();
			staff.setFullName("Sneha");
			staff.setGender("Female");
			staff.setMobileNo("2212348");
			staff.setAge(25);
			
			staff.setBranch(branch);
			staffSet.add(staff);
			
			branch.setBranchStaff(staffSet);
			session.save(branch);
			session.save(staff);
			
			flag=true;
		}
		finally 
		{
			if (transaction !=null)
			{
				if (flag)
				{
					transaction.commit();
				}
				else {
					transaction.rollback();
				}
				session.close();
			}
			SessionFactoryRegistry.closeSessionFactoryRegistry();
		}
		

	}

}
