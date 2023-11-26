package com.example.rudra.methodreferences;

public class Test2 {
	public static void main(String[] args) {
		K k;
		C obj=new C();
		k=obj::add;
		int p=k.action(10, 20);
		System.out.println(p);
		k=obj::sub;
		int q=k.action(10, 20);
		System.out.println(q);
		k=obj::mul;
		int r=k.action(10, 20);
		System.out.println(r);
	}

}
