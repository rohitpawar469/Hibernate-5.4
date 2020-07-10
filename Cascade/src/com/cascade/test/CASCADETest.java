package com.cascade.test;

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
