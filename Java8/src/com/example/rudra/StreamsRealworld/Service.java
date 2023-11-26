package com.example.rudra.StreamsRealworld;

import java.util.List;
import java.util.stream.Collectors;

public class Service {

	public static void main(String[] args) {
		System.out.println(evaluateTaxUsers("tax"));
	}
	public static List<Employee> evaluateTaxUsers(String input) {
		if (input.equalsIgnoreCase("tax")) {
			return Database.getEmployees().stream().filter(e -> e.getSalary() > 7000).collect(Collectors.toList());
		}else {
			return Database.getEmployees().stream().filter(e->e.getSalary()<=7000).collect(Collectors.toList());
		}
	}
}
