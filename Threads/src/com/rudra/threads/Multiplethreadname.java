package com.rudra.threads;

public class Multiplethreadname extends Thread 
{
	public void run()
	{
		System.out.println("Thread task : "+Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello :"+Thread.currentThread().getName());
		Multiplethreadname th=new Multiplethreadname();
		th.start();
		Multiplethreadname th1=new Multiplethreadname();
		th1.start();
	}
}
