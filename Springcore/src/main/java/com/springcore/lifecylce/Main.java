package com.springcore.lifecylce;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecylce/LifeCycleConfig.xml");
		Snacks s=(Snacks)context.getBean("s1");
		System.out.println(s);
		context.registerShutdownHook();
		//Destroy method is called when we call this registerShutdownHook(). And this registerShutdownHook() is aprt of Abstract ApplicationContext.
		Drinks d=(Drinks)context.getBean("p1");
		System.out.println(d);
		Example e=(Example)context.getBean("e1");
		System.out.println(e);
	}
}
