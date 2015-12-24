package com.pranave;

class Rectangle {
	int length;
	int width;

	void getData(int length, int width) {
		this.length = length;
		this.width = width;
	}

	void displayArea() {
		System.out.println("Area of Rectangle = " + (length * width));
	}
}

public class LearnClass {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();// r is an object of class Rectangle
		r.getData(10, 20); // calling method getData() of class Rectangle
		r.displayArea(); // calling method displayArea() of class Rectangle

	}

}
