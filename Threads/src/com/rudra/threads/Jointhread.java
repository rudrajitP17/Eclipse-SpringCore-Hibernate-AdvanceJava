package com.rudra.threads;

public class Jointhread extends Thread{
	static Thread mainthread;
	public void run() {
		try {
			mainthread.join();
			for(int i=1;i<4;i++) {
				System.out.println("Child Thread "+i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		mainthread=Thread.currentThread();
		Jointhread t=new Jointhread();
		t.start();
		try {
			for(int i=1;i<4;i++) {
				System.out.println("Main Thread"+i);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
