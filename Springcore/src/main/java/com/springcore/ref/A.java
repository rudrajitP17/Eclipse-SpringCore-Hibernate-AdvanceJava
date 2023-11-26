package com.springcore.ref;

public class A {
	
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A(int x) {
		super();
		this.x = x;
	}

	@Override
	public String toString() {
		return "A [x=" + x + "]";
	}
	
}
