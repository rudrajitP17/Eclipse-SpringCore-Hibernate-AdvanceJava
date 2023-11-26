package com.rudra.threads.staticsynchornization;

public class MovieBookApp {

	public static void main(String[] args) {
		BookTheatreSeat b1=new BookTheatreSeat();
		MyThread1 t1=new MyThread1(b1, 7);
		t1.start();
		MyThread2 t2=new MyThread2(b1, 6);
		t2.start();
		BookTheatreSeat b2=new BookTheatreSeat();
		MyThread1 t3=new MyThread1(b2, 9);
		t3.start();
		MyThread2 t4=new MyThread2(b2, 4);
		t4.start();
	}

}
