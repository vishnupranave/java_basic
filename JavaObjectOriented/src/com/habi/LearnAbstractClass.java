package com.pranave;
abstract class Shape{
	//You cannot declare abstract fields
	abstract void draw(); // This must be implemented by the derived class
	
}
class Circle extends Shape{
	
	void draw(){
		System.out.println("I will draw a circle after learning graphics!");
	}
}
class Rectangles extends Shape{
	void draw(){
		System.out.println("I will draw a rectangle after learning graphics!");
	}
}

public class LearnAbstractClass {

	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		Rectangles r = new Rectangles();
		r.draw();

	}

}
