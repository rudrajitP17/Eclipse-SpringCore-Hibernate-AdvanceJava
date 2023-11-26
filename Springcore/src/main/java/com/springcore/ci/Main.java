package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/CiConfig.xml");
		Certi c=(Certi)context.getBean("aref");
		Normal n=(Normal)context.getBean("nref");
		System.out.println(c);
		System.out.println(n);
	}

}
