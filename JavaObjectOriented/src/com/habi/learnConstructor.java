package com.pranave;

class Square {
	int length;
	int area;

	Square() {
		System.out.println("Inside Default Constructor!");
		length = 0;
		area = 0;
	}

	Square(int length) {
		System.out.println("Inside Parameterized Constructor!");
		this.length = length;
	}

	void displayArea() {
		area = (length * length);
		System.out.println("Area of Square = " + area);
	}
}

public class learnConstructor {

	public static void main(String[] args) {
		Square s1 = new Square();
		s1.displayArea();
		
		Square s2 = new Square(5);
		s2.displayArea();
	}

}
