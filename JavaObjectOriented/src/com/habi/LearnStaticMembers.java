package com.pranave;

class Calculate {
	static int count;

	static int displayCount() {
		return count;
	}

	static double add(double x, double y) {
		count++;
		return (x + y);
	}

	static double sub(double x, double y) {
		count++;
		return (x - y);
	}

	static double mul(double x, double y) {
		count++;
		return (x * y);
	}

	static double div(double x, double y) {
		count++;
		return (x / y);
	}

	static double min(double x, double y) {
		count++;
		return x <= y ? x : y;
	}

	static double max(double x, double y) {
		count++;
		return x >= y ? x : y;
	}
}

public class LearnStaticMembers {

	public static void main(String[] args) {

		Calculate.count = 0;

		System.out.println("add(3.0,5.0) = " + Calculate.add(3.0, 5.0));
		System.out.println("sub(3.0,5.0) = " + Calculate.sub(3.0, 5.0));
		System.out.println("mul(3.0,5.0) = " + Calculate.mul(3.0, 5.0));
		System.out.println("div(3.0,5.0) = " + Calculate.div(3.0, 5.0));
		System.out.println("min(3.0,5.0) = " + Calculate.min(3.0, 5.0));
		System.out.println("max(3.0,5.0) = " + Calculate.max(3.0, 5.0));

		System.out.println("Count = " + Calculate.count);
	}

}
