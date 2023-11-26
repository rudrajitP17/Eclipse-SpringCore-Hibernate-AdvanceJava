package com.example.rudra.ConsumerPredicateSupplier;

import java.util.function.Consumer;

public class Consumerimp {

	public static void main(String[] args) {
		Consumer<Integer> con=(t)->System.out.println("Printing : "+t);
		con.accept(100);
	}
}
