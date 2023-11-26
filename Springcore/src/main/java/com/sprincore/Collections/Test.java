package com.sprincore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Note - Here you should specify package structure using /
		ApplicationContext context=new ClassPathXmlApplicationContext("com/sprincore/Collections/CollecionConfig.xml");
		Emp e1=(Emp)context.getBean("emp1");
		System.out.println(e1.getName());
		System.out.println(e1.getCity());
		System.out.println(e1.getCourses());
		System.out.println(e1.getPhones());
		System.out.println(e1.getPhones().getClass().getName());
	}

}
