package com.example.rudra.Optionalclasses;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.example.rudra.Flatmapandmap.Customer;
import com.example.rudra.Flatmapandmap.EkartDataBase;

public class Optionalclassexample {
	public static Customer getcustomerbyemail(String email) {
		List<Customer> customers=EkartDataBase.getAll();
		return customers.stream().filter(c->c.getEmail().equals(email))
				.findAny().get();
	}
	public static void main(String[] args) {
		Customer customer=new Customer(102,"John",null,Arrays.asList("345","345"));
		Optional<Object> emptyoptional=Optional.empty();
		System.out.println(emptyoptional);
		Optional<String> emailoptional2=Optional.ofNullable(customer.getEmail());
		System.out.println(emailoptional2);
//		Optional<String> emailoptional=Optional.of(customer.getEmail());
//		System.out.println(emailoptional);
		if(emailoptional2.isPresent()) {
			System.out.println(emailoptional2.get());
		}
		System.out.println(emailoptional2.orElse("default@email.com"));
//		System.out.println(emailoptional2.orElseThrow(()->new IllegalArgumentException("email not present")));
		System.out.println(emailoptional2.map(String::toUpperCase).orElseGet(()->"Deafult email"));
		System.out.println(getcustomerbyemail("aba@abc.com"));
	}

}
