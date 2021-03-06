package com.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory;
	private static Session session;

	public static SessionFactory getSessionFactory() {
		if (factory == null || !factory.isOpen()) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");

			factory = configuration.buildSessionFactory();
		}
		return factory;
	}

	public static Session getSession() {
		if (session == null || !session.isOpen()) {
			session = getSessionFactory().openSession();
		}
		//
		session.clear();
		
		return session;
	}
}
