package com.Rudra.HibeDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App2 {

	public static void main(String[] args) 
	{
		Learner l=new Learner();
		Certificate c=new Certificate();
		c.setCourse(1);
		c.setDuration(2);
		l.setCerti(c);
		l.setCity("kol"); //transient
		l.setId(101);
		l.setStreet("Bahadur");
		Learner l1=new Learner();
		Certificate c1=new Certificate();
		c1.setCourse(1);
		c1.setDuration(2);
		l1.setCerti(c1);
		l1.setCity("kol");
		l1.setId(102);
		l1.setStreet("Bahadur");
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(l1);
        session.save(l);
        l.setCity("Pol"); //l-persistent - database,session
        tx.commit();
        session.close();
        l.setCity("Hol"); //detached - l
        System.out.println(l.getCity());
	}

}
