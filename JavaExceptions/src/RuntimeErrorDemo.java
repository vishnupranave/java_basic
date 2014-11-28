public class RuntimeErrorDemo {

	public static void main(String[] args) {

		int x = 10, y = 5, z;
		z = x / (y - y); //Cause  / by zero exception
		System.out.println("Value of z = " + z);
	}

}
