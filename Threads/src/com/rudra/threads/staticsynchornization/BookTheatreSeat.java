package com.rudra.threads.staticsynchornization;

public class BookTheatreSeat {
	static int total_seats =20;
	static synchronized void bookseats(int seats) {
		if(total_seats>seats) {
			System.out.println("Seats booked succesfully");
			total_seats=total_seats-seats;
			System.out.println("Seats left : "+seats);
		}else {
			System.out.println("Seats cannot be booked");
			System.out.println("Seats left : "+seats);
		}
	}
}
