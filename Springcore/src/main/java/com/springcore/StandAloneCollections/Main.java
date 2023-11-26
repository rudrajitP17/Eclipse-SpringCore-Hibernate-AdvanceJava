package com.springcore.StandAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/StandAloneCollections/Config.xml");
		Person p=context.getBean("p1",Person.class);
		System.out.println(p.getDb());
		System.out.println(p.getDb().getClass().getName());

		System.out.println(p.getFees());
		System.out.println(p.getFees().getClass().getName());

		System.out.println(p.getFriends());
		System.out.println(p.getFriends().getClass().getName());
	}

}
