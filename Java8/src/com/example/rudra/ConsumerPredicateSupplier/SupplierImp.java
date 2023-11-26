package com.example.rudra.ConsumerPredicateSupplier;

import java.util.function.Supplier;

public class SupplierImp
{
	public static void main(String args[]) {
		Supplier<String> s=()->"Hi";
		System.out.println(s.get());
	}
}
