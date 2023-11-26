package com.rudra.threads;

public class Daemonthreads extends Thread 
{
	public void run()
	{
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Task inside thread");
	}
	public static void main(String[] args) 
	{
//		System.out.println("Main Thread");
		Daemonthreads t=new Daemonthreads();
		t.start();
		t.setDaemon(true);
	}

}
