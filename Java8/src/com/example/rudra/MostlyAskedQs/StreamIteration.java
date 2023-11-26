package com.example.rudra.MostlyAskedQs;

import java.util.stream.Stream;

public class StreamIteration {
	public static void main(String[] args) {
		Stream.iterate(1, c->c+2).limit(6).forEach((c)->System.out.print(c+" "));
	}

}
