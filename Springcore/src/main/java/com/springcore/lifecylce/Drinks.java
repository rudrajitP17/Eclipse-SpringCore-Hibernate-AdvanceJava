package com.springcore.lifecylce;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Drinks implements InitializingBean,DisposableBean
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Drinks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drinks(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drinks [price=" + price + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy method");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside init method");
	}
	
}
