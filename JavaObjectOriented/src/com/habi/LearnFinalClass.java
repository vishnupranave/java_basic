package com.pranave;

final class FinalDemo {
	int x;

	void setX(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}

}

/*
 * class XYZ extends FinalDemo{
 *  cannot derive from a final class
 * }
 */

public class LearnFinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalDemo fd = new FinalDemo();
		fd.setX(19);
		System.out.println(fd.getX());
	}

}
