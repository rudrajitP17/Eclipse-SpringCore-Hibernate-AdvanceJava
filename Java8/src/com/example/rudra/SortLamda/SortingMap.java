package com.example.rudra.SortLamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.example.rudra.StreamsRealworld.Employee;

public class SortingMap {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		List<Entry<String, Integer>> entries=new ArrayList<>(map.entrySet());
		Collections.sort(entries, (o1,o2)->o1.getKey().compareTo(o2.getKey()));
//		for(Entry<String, Integer> entry:entries) {
//			System.out.print(entry.getKey()+" "+entry.getValue()+" ");
//		}
//		System.out.println();
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::print);
//		System.out.println();
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::print);
		Map<Employee,Integer> employeeMap=new TreeMap<>((o1,o2)->(int) (o1.getSalary()-o2.getSalary()));
		employeeMap.put(new Employee(101,"Roshan","IT",6000),40);
		employeeMap.put(new Employee(102,"Roshan","Sales",7000),50);
		employeeMap.put(new Employee(103,"Roshan","IT",8000),30);
		employeeMap.put(new Employee(104,"Roshan","Sales",9000),20);
//		System.out.println(employeeMap);
		employeeMap.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
		.forEach(System.out::print);
	}
}
