package com.springcore.ci;

public class Certi 
{
	String name;
	//This variable is not declared as private because this is used by other class where constructor initialization is done, so in order to constrcutor cannot access variables which are private in other class.
	public Certi(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certi [name=" + name + "]";
	}
	
}
