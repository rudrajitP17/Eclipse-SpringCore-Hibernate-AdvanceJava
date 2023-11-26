package com.example.rudra.ConsumerPredicateSupplier;

import java.util.function.Predicate;

public class PredicateImp{

	public static void main(String[] args) {
		Predicate<Integer> p=(t)->t%2==0;
		System.out.println(p.test(9));
	}
}
