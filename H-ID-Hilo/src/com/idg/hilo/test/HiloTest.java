package com.idg.hilo.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.idg.hilo.dao.FeedbackDAO;
import com.idg.hilo.entities.Feedback;
import com.idg.hilo.helper.SessionFactoryRegistry;

public class HiloTest {

	public static void main(String[] args) {
		
	List<Feedback> feedbacks=new ArrayList<Feedback>();
	FeedbackDAO feedbackDAO=new FeedbackDAO();
	for(int i=0;i<5;i++)
	{
	Feedback  feedback=new Feedback();
		feedback.setFeedbackName("Nice"+i);
		feedback.setUserName("Rohit");
		feedback.setDescription("Nice features");
		feedback.setProductName("Mobile");
		feedback.setRating(+i);
		feedbacks.add(feedback);
		
		
	}
	feedbackDAO.saveFeedback(feedbacks);
			
	
	}

}
