package com.hibernate;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.util.*;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(city.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			List<city> cities = session.createQuery("from City").getResultList();
			for(city city: cities) {
				
				System.out.println(city.getName());
			}
			session.getTransaction().commit();
		}
		finally {
							session.close();
		}
	}
}
