package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.pojo.Demo;

//public class BIManager {
//	SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
//
//	public void insert(Demo d) {
//		Session s = sessionFactory.openSession();
//		Transaction t = s.beginTransaction();
//		s.save(d);
//		t.commit();
//		s.close();
//}}

//package com.model;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.AnnotationConfiguration;
//
//import com.pojo.Demo;
//
public class BIManager {
	public void insert(Demo d) {

		AnnotationConfiguration config = new AnnotationConfiguration().configure();
		config.addAnnotatedClass(Demo.class);
		SessionFactory sessionFactory = config.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(d);

		tx.commit();
		session.close();

	}

}
