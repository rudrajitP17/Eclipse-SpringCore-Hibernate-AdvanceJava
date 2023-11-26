package com.rudra.threads;

public class Threads1 extends Thread 
{
	public void run()
	{
		System.out.println("Task1");
	}
	public static void main(String args[])
	{
		Threads1 th=new Threads1();
		th.start();
		
		Threads1 th1=new Threads1();
		th.start();
	}
}
