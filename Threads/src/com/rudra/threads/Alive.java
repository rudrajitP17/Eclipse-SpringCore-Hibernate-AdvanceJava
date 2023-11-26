package com.rudra.threads;

public class Alive extends Thread
{
	public void run()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) 
	{
		Alive t=new Alive();
		t.start();
		System.out.println(t.isAlive());
		System.out.println(Thread.currentThread().isAlive());
	}
}
