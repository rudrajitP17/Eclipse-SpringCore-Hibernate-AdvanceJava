package com.rudra.threads.synchorinzation;

public class BookTheatreSeat {
	int total_seats=10;
	void bookSeat(int seats) {
		System.out.println(Thread.currentThread().getName());
		synchronized (this) {
			if(total_seats>seats) {
				System.out.println("Seats Booked Successfully");
				total_seats=total_seats-seats;
				System.out.println("Seats left : "+total_seats);
			}else {
				System.out.println("Seats cannot be booked.");
				System.out.println("Seats left : "+total_seats);
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
}
