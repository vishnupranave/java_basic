package com.pranave;

class Base{
	int x;
	Base(int x){
		this.x = x;
	}
	void displayX(){
		System.out.println("Base x = " + x);
	}
	
}
class Derived extends Base{
	int y;
	Derived(int x, int y){
		super(x);
		this.y = y;
	}
	void displayXY(){
		System.out.println("Base x = " + x);
		System.out.println("Derived y = " + y);
	}
}
public class LearnMethodOverriding {

	public static void main(String[] args) {
		
Derived d = new Derived(5,10);
d.displayXY();
	}

}
