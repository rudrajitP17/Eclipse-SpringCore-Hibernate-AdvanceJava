package com.example.rudra.Flatmapandmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapandFlatmap {
	public static void main(String[] args) {
		List<Customer> list=EkartDataBase.getAll();
		List<String> emails=list.stream().map(e->e.getEmail()).collect(Collectors.toList());
//		System.out.println(emails);
		List<List<String>> phones=list.stream().map(p->p.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(phones);
		List<String> phones1=list.stream().flatMap(p->p.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(phones1);
	}
}
