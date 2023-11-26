package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        Student s=(Student) context.getBean("student1");
        Student s1=(Student) context.getBean("student2");
        Student s2=(Student) context.getBean("student3");
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
