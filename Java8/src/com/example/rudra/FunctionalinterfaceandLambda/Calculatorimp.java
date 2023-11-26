package com.example.rudra.FunctionalinterfaceandLambda;

public class Calculatorimp {

	public static void main(String[] args) {
		Calculator calculator = (b,z)->z-b;
		System.out.println(calculator.input(100,300));
	}
}
