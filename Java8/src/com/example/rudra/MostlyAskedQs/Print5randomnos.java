package com.example.rudra.MostlyAskedQs;

import java.util.Random;

public class Print5randomnos {
	public static void main(String[] args) {
		Random random=new Random();
		random.ints(5,100).limit(5).sorted().forEach(System.out::println);
	}

}
