package com.example.rudra.Flatmapandmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
	public static List<Customer> getAll(){
		return Stream.of(
				new Customer(101,"Rudra","aba@abc.com",Arrays.asList("123","123")),
				new Customer(101,"Rudra","aba@abc.com",Arrays.asList("123","123")),
				new Customer(101,"Rudra","aba@abc.com",Arrays.asList("123","123")),
				new Customer(101,"Rudra","aba@abc.com",Arrays.asList("123","123"))
			).collect(Collectors.toList());
	}
}
