package com.rudra.threads.synchorinzation;

public class MovieBookApp extends Thread{
	static BookTheatreSeat b;
	int seats;
	public void run() {
		b.bookSeat(seats);
	}
	public static void main(String[] args) {
		b=new BookTheatreSeat();
		MovieBookApp Rudra=new MovieBookApp();
		Rudra.seats=7;
		Rudra.start();
		MovieBookApp Rudra1=new MovieBookApp();
		Rudra1.seats=6;
		Rudra1.start();
	}
}
