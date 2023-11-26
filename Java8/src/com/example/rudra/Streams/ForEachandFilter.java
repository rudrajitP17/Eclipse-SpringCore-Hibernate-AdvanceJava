package com.example.rudra.Streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachandFilter {

	public static void main(String[] args) {
		List<String> s=new ArrayList<>();
		s.add("Ram");
		s.add("Raam");
		s.add("Shyam");
//		s.stream().filter(t->t.startsWith("R")).forEach(t->System.out.print(t+" "));
		Map<Integer, String> m=new HashMap<>();
		m.put(1, "b");
		m.put(2, "d");
		m.put(3, "f");
//		m.forEach((key,value)->System.out.print(key+" "+value+" "));
//		System.out.println();
		m.entrySet().stream().filter(t->t.getKey()%2==0).forEach(obj->System.out.print(obj+" "));
	}

}
