package com.pranave;

class Person {
	private String name;
	private int age;
	private char sex;

	Person(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	protected String getName() {
		return name;
	}

	protected char getSex() {
		return sex;
	}

	protected int getAge() {
		return age;
	}

}

class Employee extends Person {
	private String companyName;
	private String designation;

	Employee(String name, int age, char sex, String designation) {
		super(name, age, sex);
		companyName = "ABC LIMITED";
		this.designation = designation;
	}

	protected String getCompanyName() {
		return companyName;
	}

	protected String getDesignation() {
		return designation;
	}

}

class Manager extends Employee {
	double salary;

	Manager(String name, int age, char sex, double salary) {
		super(name, age, sex, "Manager");
		this.salary = salary;
	}

	private double getSalary() {
		return salary;
	}

	void displayDetails() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Sex: " + getSex());
		System.out.println("Company: " + getCompanyName());
		System.out.println("Designation: " + getDesignation());
		System.out.println("Salary: " + getSalary());

	}

}

public class LearnMultilevelInheritance {

	public static void main(String[] args) {
		Manager m = new Manager("PRANAVE", 22, 'M', 1000);
		m.displayDetails();
		System.out.println();
		Manager r = new Manager("VISHNU", 23, 'M', 5000);
		r.displayDetails();
		
	}

}
