package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp 
{
	//@Autowired //1st way
	private Address address;

	public Address getAddress() {
		return address;
	}
	//@Autowired //2nd way
	public void setAddress(Address address) {
		this.address = address;
	}
	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override //3rd way
	@Qualifier("address1")
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
