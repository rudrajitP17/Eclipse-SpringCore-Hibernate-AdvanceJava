package com.example.rudra.methodreferences;

public class Test1 {

	public static void main(String[] args) {
		B obj=new B();
		J j=obj::lowercase;
		String s=j.apply("ABC");
		System.out.println(s);
	}

}
