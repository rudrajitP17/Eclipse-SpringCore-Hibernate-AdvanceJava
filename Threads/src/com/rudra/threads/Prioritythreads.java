package com.rudra.threads;

public class Prioritythreads extends Thread 
{
	public void run(){
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		System.out.println("Old "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println("New "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("New1 "+Thread.currentThread().getPriority());
		Prioritythreads t=new Prioritythreads();
		t.start();
	}
}
