package com.example.rudra.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateAndTerminalOps {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,82);
		System.out.println(list.stream().filter(e->e%2==0).map(e->e=e+2).count());
		System.out.println(list.stream().filter(e->e%2==0).map(e->e=e+2));
		System.out.println(list.stream().max(Comparator.comparing(Integer::valueOf)).get());
	}
}
