package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App5 {

	public static void main(String[] args) 
	{
		Emp e1=new Emp();
		Emp e2=new Emp();
		Project p1=new Project();
		Project p2=new Project();
		
		e1.setE_id(1);
		e1.setE_type("Rudra");
		e2.setE_id(2);
		e2.setE_type("Tudra");
		
		p1.setP_id(3);
		p1.setP_type("Java");
		p2.setP_id(4);
		p2.setP_type("Python");
		
		List<Emp> elist=new ArrayList<Emp>();
		List<Project> plist=new ArrayList<Project>();
		
		elist.add(e2);
		elist.add(e1);
		plist.add(p1);
		plist.add(p2);
		
		e1.setP(plist);
		p2.setEmp(elist);
		
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);
        tx.commit();
        session.close();

	}

}
