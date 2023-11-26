package com.rudra.threads;

public class Threadc extends Thread 
{
	public void run()
	{
		System.out.println("Thread Task 1");
	}
	public static void main(String[] args) 
	{	
		Threadc t=new Threadc();
		t.start();
		t.start();
	}

}
