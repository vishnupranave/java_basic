package com.habi;

class Color {
	String color;

	Color(String color) {
		this.color = color;
	}

	String getColor() {
		return color;
	}

}

class Paint extends Color {
	int cost;

	Paint(String color, int cost) {
		super(color);
		this.cost = cost;
	}

	String details() {
		return "Paint choosen has color:" + color + ", and cost:" + cost;
	}

}

public class LearnSingleInheritance {

	public static void main(String[] args) {
		Paint p = new Paint("RED", 50);
		System.out.println(p.details());

	}

}
