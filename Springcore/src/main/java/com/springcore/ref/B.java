package com.springcore.ref;

public class B {
	private int y;
	private A ob;
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public A getOb() {
		return ob;
	}
	public void setOb(A ob) {
		this.ob = ob;
	}
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public B(int y, A ob) {
		super();
		this.y = y;
		this.ob = ob;
	}
	@Override
	public String toString() {
		return "B [y=" + y + ", ob=" + ob + "]";
	}
	
}
