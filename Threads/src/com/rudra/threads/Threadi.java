package com.rudra.threads;

public class Threadi implements Runnable 
{

	public static void main(String[] args) {
		Threadi t=new Threadi();
		Thread th=new Thread(t);
		th.start();
	}

	@Override
	public void run() {
		System.out.println("Thread Task 2");
	}

}
