package com.rudra.threads;

public class SleepThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++){
			try {
				System.out.print(i+" ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			try {
				System.out.print(i+" ");
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		SleepThread t=new SleepThread();
		t.start();
	}

}
