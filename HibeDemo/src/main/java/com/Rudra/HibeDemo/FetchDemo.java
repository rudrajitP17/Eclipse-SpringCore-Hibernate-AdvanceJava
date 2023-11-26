package com.Rudra.HibeDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Student s=(Student)session.load(Student.class, 102);
        Student s1=(Student)session.load(Student.class, 102);
        System.out.println(s1);
        Address ad=session.get(Address.class, 1);
        Address ad1=session.get(Address.class, 1);
        System.out.println(ad1.getStreet()+" : "+ad1.getStreet());
	}

}
