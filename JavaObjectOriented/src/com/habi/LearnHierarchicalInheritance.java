package com.habi;

class F {
	private char f;

	char getF() {
		return f;
	}

	void setF(char f) {
		this.f = f;
	}
}

class G extends F {

	private char g;

	char getG() {
		return g;
	}

	G(char g, char f) {
		this.g = g;
		setF(f);
	}
}

class H extends F {

	private char h;

	char getH() {
		return h;
	}

	H(char h, char f) {
		this.h = h;
		setF(f);
	}
}

class I extends F {

	private char i;

	char getI() {
		return i;
	}

	I(char i, char f) {
		this.i = i;
		setF(f);
	}
}

public class LearnHierarchicalInheritance {

	public static void main(String[] args) {
		G og = new G('A', 'B');
		System.out.println("g = " + og.getG() + ", f =" + og.getF());
		H oh = new H('C', 'D');
		System.out.println("h = " + oh.getH() + ", f =" + oh.getF());
		I oi = new I('E', 'F');
		System.out.println("i = " + oi.getI() + ", f =" + oi.getF());
	}

}
