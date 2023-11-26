package com.example.rudraReduceMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduceclass {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		int s=0;
		for(int i:list)
			s=s+i;
		System.out.println(s);
		int s1=list.stream().mapToInt(i->i).sum();
		System.out.println(s1);
		int reducesum=list.stream().reduce(0, (a,b)->a+b);
		System.out.println(reducesum);
		Optional<Integer> reducewithmethodreference=list.stream().reduce(Integer::sum);
		System.out.println(reducewithmethodreference.get());
		int mulresult=list.stream().reduce(1, (a,b)->a*b);
		System.out.println(mulresult);
		int maxvalue=list.stream().reduce(0, (a,b)->a>b?a:b);
		System.out.println(maxvalue);
		int maxvalue1=list.stream().reduce(Integer::max).get();
		System.out.println(maxvalue1);
		double SumofSalaryofAgradeemployees=EmpData.getAllemp().stream()
				.filter(e->e.getGrade().equals("A")).map(e->e.getSalary()).mapToInt(i->i).sum();
		System.out.println(SumofSalaryofAgradeemployees);
	}
}
