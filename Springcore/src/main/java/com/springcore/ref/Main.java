package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/RefConfig.xml");
		A a=(A)context.getBean("aref");
		System.out.println(a);
		B b=(B)context.getBean("bref");
		System.out.println(b);
	}

}
