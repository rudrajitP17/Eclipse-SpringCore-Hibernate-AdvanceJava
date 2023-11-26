package com.example.rudra.LambdaProject;

import java.util.ArrayList;
import java.util.List;

public class Dao {
	public List<Pojo> getBooks(){
		List<Pojo> books=new ArrayList<>();
		books.add(new Pojo(101,"Core Java",400));
		books.add(new Pojo(102,"Hibernate",500));
		books.add(new Pojo(103,"Sql",600));
		books.add(new Pojo(104,"Webservices",700));
		return books;
	}
}
