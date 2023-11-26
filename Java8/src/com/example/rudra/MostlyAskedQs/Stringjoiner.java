package com.example.rudra.MostlyAskedQs;

import java.util.StringJoiner;

public class Stringjoiner {
	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner(",");
		sj.add("Ram");
		sj.add("Bam");
		sj.add("Shyam");
		System.out.println(sj);
	}

}
