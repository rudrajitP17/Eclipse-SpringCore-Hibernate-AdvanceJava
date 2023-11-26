package com.springcore.lifecylce;

public class Snacks 
{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Price");
		this.price = price;
	}

	public Snacks(double price) {
		super();
		this.price = price;
	}
	
	public void init()
	{
		System.out.println("Inside init method");
	}
	//When we change the name of init and destroy method keeping the syntax same for the methods - * Go to LifeCycleConfig.xml
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
	public Snacks() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Snacks [price=" + price + "]";
	}
	
}
