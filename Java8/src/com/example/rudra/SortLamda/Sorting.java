package com.example.rudra.SortLamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.example.rudra.StreamsRealworld.Database;
import com.example.rudra.StreamsRealworld.Employee;

public class Sorting {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(8);
		list.add(2);
		list.add(3);
		list.add(9);
//		Collections.sort(list);
//		Collections.reverse(list);
//		System.out.println(list);
//		list.stream().sorted().forEach(t->System.out.print(t+" "));
//		System.out.println();
//		list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+" "));
		List<Employee> employees=Database.getEmployees();
		Collections.sort(employees, (o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
		System.out.println(employees);
		employees.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::print);
		System.out.println();
		employees.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::print);
	}
}
