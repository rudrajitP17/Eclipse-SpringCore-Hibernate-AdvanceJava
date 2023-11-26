package com.example.rudra.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate id=LocalDate.now();
		System.out.println(id+" "+id.getDayOfMonth()+" "+id.getDayOfYear()+" "+id.getYear());
		LocalTime it=LocalTime.now();
		System.out.println(it+" "+it.getMinute()+" "+it.plusMinutes(3));
		LocalDateTime im=LocalDateTime.now();
		System.out.println(im+" "+im.getDayOfWeek());
	}

}
