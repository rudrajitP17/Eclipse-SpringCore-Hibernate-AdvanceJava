package com.example.rudraReduceMap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpData {
	public static List<Emp> getAllemp(){
		return Stream.of(
		new Emp(101,"Rudra","A",60000),
		new Emp(101,"Rudra","B",90000),
		new Emp(101,"Rudra","C",80000),
		new Emp(101,"Rudra","A",70000)).collect(Collectors.toList());
	}
}
