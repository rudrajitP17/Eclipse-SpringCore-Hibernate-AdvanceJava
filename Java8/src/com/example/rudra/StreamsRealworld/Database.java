package com.example.rudra.StreamsRealworld;

import java.util.ArrayList;
import java.util.List;

public class Database {
	public static List<Employee> getEmployees(){
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(101,"Roshan","IT",6000));
		list.add(new Employee(102,"Roshan","Sales",7000));
		list.add(new Employee(103,"Roshan","IT",8000));
		list.add(new Employee(104,"Roshan","Sales",9000));
		return list;
	}
}
