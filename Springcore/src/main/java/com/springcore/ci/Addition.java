package com.springcore.ci;
import java.io.*;
public class Addition 
{
	private int a;
	private int b;
	
	public Addition(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Integer");
	}
	public Addition(double a,double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Double");
	}
	public Addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("String");
	}
	public void add()
	{
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println(a+b);
	}
	// In this type of constructor overloading classes spring gets confused to initialize which constructor, since the default data type for initialization is String, it will first
	// go to string constructor, then depending on the ordering of constructors from top to bottom it will choose the first one.
	// That is the reason specify the type in xml file so in-order to choose the particular constructor and we can also specify the
	// the indexing(which value to be initialize first)
}
