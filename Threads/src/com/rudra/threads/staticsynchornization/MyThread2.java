package com.rudra.threads.staticsynchornization;

public class MyThread2 extends Thread{
	BookTheatreSeat b;
	int seats;
	public MyThread2(BookTheatreSeat b,int seats) {
		this.b=b;
		this.seats=seats;
	}
	public void run() {
		b.bookseats(seats);
	}
}
