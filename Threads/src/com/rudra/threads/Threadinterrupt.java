package com.rudra.threads;

public class Threadinterrupt extends Thread{
	public void run() {
		try {
		for(int i=1;i<4;i++) {
			System.out.println(i);
//			Thread.sleep(1000);
		}
		}catch(Exception e) {
			System.out.println("Thread interrupted "+e);
		}
	}
	public static void main(String[] args) {
		Threadinterrupt t=new Threadinterrupt();
		t.start();
		t.interrupt();
	}
}
