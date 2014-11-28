package com.habi;

class Student {
	int rollNo;

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	void displayRollNo() {
		System.out.println("Roll no : " + rollNo);
	}
}

class Test extends Student {
	float part1, part2;

	void setMarks(float m1, float m2) {
		part1 = m1;
		part2 = m2;
	}

	void displayMarks() {
		System.out.println("Marks Obtained");
		System.out.println("part1 = " + part1);
		System.out.println("part2 = " + part2);
	}
}
interface Sports{
	float sportWt = 5.0F;
	void displayWt();
}
class Results extends Test implements Sports{
	float total;
	public void displayWt(){
		System.out.println("Sports Weight = " + sportWt);
	}
	void display(){
		total = part1 +part2 +sportWt;
		displayRollNo();
		displayMarks();
		displayWt();
		
		
	}
}
public class learnInterface {

	public static void main(String[] args) {
Results r = new Results();
r.setRollNo(10);
r.setMarks(90,83);
r.display();
	}

}
