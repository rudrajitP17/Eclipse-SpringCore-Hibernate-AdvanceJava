package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com./springcore/autowire/AutowireConfig.xml");
        Emp e=context.getBean("emp1",Emp.class);
        //If we write it this way, we don't have to typecaste it
        System.out.println(e);
	}
}
