package com.example.rudra.streamsandparallelstreams;

import java.util.stream.IntStream;

public class Parallelstreamexample {
	public static void main(String[] args) {
		long start=0,end=0;
		start=System.currentTimeMillis();
		IntStream.range(1, 1000).parallel().forEach(System.out::print);
		end=System.currentTimeMillis();
		System.out.println();
		System.out.println("Parallel streams : "+(end-start));
		System.out.println("-----------------------------------");
		start=System.currentTimeMillis();
		IntStream.range(1, 1000).forEach(System.out::print);
		end=System.currentTimeMillis();
		System.out.println();
		System.out.println("Normal streams : "+(end-start));
//		IntStream.range(1, 10).forEach(x->System.out.print("Thread : "+Thread.currentThread().getName()+" : "+x+". "));
//		System.out.println("----------------------------------");
//		IntStream.range(1, 10).parallel().forEach(x->System.out.print("Thread : "+Thread.currentThread().getName()+" : "+x+". "));
	}

}
