package com.rudra.threads;

public class YieldThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName()+" "+i);
	}
	public static void main(String args[]) {
		YieldThread thread=new YieldThread();
				thread.start();
		Thread.currentThread().yield();
		for(int i=0;i<5;i++)
			System.out.println(Thread.currentThread().getName()+" "+i);
	}
}
