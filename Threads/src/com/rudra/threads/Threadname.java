package com.rudra.threads;

public class Threadname 
{
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Rudra");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}
}
