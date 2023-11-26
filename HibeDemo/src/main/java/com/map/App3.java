package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App3 {

	public static void main(String[] args) 
	{
		Question q=new Question();
		Answer a=new Answer();
		a.setA_id(1);
		a.setA_type("My name is Rudra");
		q.setQ_id(2);
		q.setQ_type("What is your name");
		q.setAnswer(a);
		a.setQuestion(q);
		Question q1=new Question();
		Answer a1=new Answer();
		a1.setA_id(3);
		a1.setA_type("My bike is R15");
		q1.setQ_id(4);
		q1.setQ_type("What is your bike");
		q1.setAnswer(a1);
		a1.setQuestion(q1);
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(q);
        session.save(a);
        session.save(q1);
        session.save(a1);
        
        Answer ans=(Answer)session.get(Answer.class, 1);
        System.out.println(ans.getA_type());
        System.out.println(ans.getQuestion().getQ_type());
        
        tx.commit();
        session.close();
	}

}
