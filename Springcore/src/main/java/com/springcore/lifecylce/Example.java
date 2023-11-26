package com.springcore.lifecylce;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example 
{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Example(int price) {
		super();
		this.price = price;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [price=" + price + "]";
	}
	@PreDestroy
	public void die()
	{
		System.out.println("Inside die-destroy");
	}
	@PostConstruct
	public void initialise()
	{
		System.out.println("Inside init-initialise");
	}
	//These two annotations are not included in after Java 9, so if you are using any version after that, you have to add external dependencies in pom.xml file
}
