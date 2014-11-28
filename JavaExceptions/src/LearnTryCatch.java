public class LearnTryCatch {

	public static void main(String[] args) {

		int x = 10, y = 5, z = 0;
		try {
			z = x / (y - y); // Cause / by zero exception
			System.out.println("Value of z = " + z);
		} catch (ArithmeticException e) {
			z = 0;
			System.out.println("Exception: " + e.toString());
			System.out.println("Value of z = " + z);
		} finally {
			System.out.println("This will be always executed!");
		}
	}

}
