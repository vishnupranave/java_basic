package com.habi;

class PassByValueDemo{
	int x;
	int y;
	
	void getData(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	void displayData()
	{
		System.out.println("x = " +x+"; y = "+y);
	}
}

public class ParameterPassing {

	/* Java performs pass by value for values,
	 * and pass by reference for objects.
	 */
	public static void main(String[] args) {
		PassByValueDemo pv = new PassByValueDemo();
		int a=4,b=5;
		System.out.println("a = " +a+"; b = "+b);
		pv.getData(a,b);
		pv.displayData();
		System.out.println("a = " +a+"; b = "+b);

	}

}
