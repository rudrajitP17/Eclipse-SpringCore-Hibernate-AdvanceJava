package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App4 {

	public static void main(String[] args) 
	{
		Question1 q=new Question1();
		Answers1 a=new Answers1();
		a.setA_id(1);
		a.setA_type("Rudra");
		a.setQuestion(q);
		Answers1 a1=new Answers1();
		a1.setA_id(2);
		a1.setA_type("Babin");
		a1.setQuestion(q);
		Answers1 a2=new Answers1();
		a2.setA_id(3);
		a2.setA_type("Neel");
		a2.setQuestion(q);
		q.setId(4);
		q.setQ_type("Your name");
		List<Answers1> list=new ArrayList<Answers1>();
		list.add(a2);
		list.add(a1);
		list.add(a);
		q.setAnswers(list);
		
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(q);
        session.save(a);
        session.save(a1);
        session.save(a2);
        
        Question1 qq=(Question1)session.get(Question1.class, 4);
        System.out.println(qq.getQ_type());
        System.out.println(qq.getAnswers().size());
        for(Answers1 aa:qq.getAnswers())
        	System.out.println(aa);
        tx.commit();
        session.close();
	}

}
