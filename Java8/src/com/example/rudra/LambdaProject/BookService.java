package com.example.rudra.LambdaProject;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public static void main(String[] args) {
		System.out.println(new BookService().getBookinSort());
	}

	private List<Pojo> getBookinSort() {
		List<Pojo> books=new Dao().getBooks();
		Collections.sort(books,(o1,o2)->o2.getName().compareTo(o1.getName()));
//		Collections.sort(books,new Comparator<Pojo>() 
//		{
//			//Intsead of this we will write lambda expression
//			@Override
//			public int compare(Pojo o1, Pojo o2) {
//				return o2.getName().compareTo(o1.getName());
//			}
//		});
		return books;
	}
}
