package com.rudra.threads.multiple;

public class Main {

	public static void main(String[] args) {
		Mythread1 m=new Mythread1();
		m.start();
		Mythread2 m1=new Mythread2();
		m1.start();
	}

}
