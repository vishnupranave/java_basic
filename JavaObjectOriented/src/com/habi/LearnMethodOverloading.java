package com.pranave;
class A{
	
	void a()
	{
		System.out.println("a has no arguments");
	}
	void a(int a)
	{
		System.out.println("a has one arguments");
	}
	void a(int a, int b)
	{
		System.out.println("a has two arguments");
	}
	void a(int a, int b, int c)
	{
		System.out.println("a has three arguments");
	}
	
}

public class LearnMethodOverloading {

	
	public static void main(String[] args) {
		
		A obj = new A();
		obj.a();
		obj.a(10);
		obj.a(10,20);
		obj.a(10,20,30);
	}

}
