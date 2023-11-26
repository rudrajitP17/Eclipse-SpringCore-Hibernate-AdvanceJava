package com.rudra.threads;

public class SleepThread2 extends Thread{
	public void run() {
		try {
			for(int i=1;i<4;i++) {
				System.out.println(i+" "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
	}
}
	public static void main(String[] args) {
		SleepThread2 t=new SleepThread2();
		t.run();
		SleepThread2 t1=new SleepThread2();
		t1.run();
	}
}
