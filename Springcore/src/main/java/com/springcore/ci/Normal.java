package com.springcore.ci;

public class Normal 
{
	private int id;
	private String name;
	private Certi certi;
	public Normal(int id, String name, Certi certi) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Normal [id=" + id + ", name=" + name + ", certi=" + certi + "]";
	}
}
