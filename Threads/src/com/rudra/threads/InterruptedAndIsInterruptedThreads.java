package com.rudra.threads;

public class InterruptedAndIsInterruptedThreads extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().isInterrupted()); //true->true
		System.out.println(Thread.currentThread().isInterrupted()); 
		try {
			for(int i=1;i<=3;i++) {
				System.out.print(i+" ");
				Thread.sleep(1000);
				}
			}catch(Exception e) {
				e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		InterruptedAndIsInterruptedThreads t=new InterruptedAndIsInterruptedThreads();
		t.start();
		t.interrupt();
	}

}
