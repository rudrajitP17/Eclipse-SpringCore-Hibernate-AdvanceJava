package com.rudra.threads.staticsynchornization;

public class MyThread1 extends Thread{
	BookTheatreSeat b;
	int seats;
	public MyThread1(BookTheatreSeat b,int seats) {
		this.b=b;
		this.seats=seats;
	}
	public void run() {
		b.bookseats(seats);
	}
}
