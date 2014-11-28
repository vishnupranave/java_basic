class Calculate {

	static void divide(int a, int b) {
		int z = 0;
		if (b == 0)
			throw new ArithmeticException();

		else
			z = a / b;
		System.out.println("z = " + z);
	}
}

public class LearnThrow {

	public static void main(String[] args) {

		try {
			Calculate.divide(5,3);
			Calculate.divide(5,0);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}

	}

}
