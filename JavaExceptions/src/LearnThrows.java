public class LearnThrows {

	static void divide() throws ArithmeticException, StackOverflowError {
		
		int z = 9 / 0;
		// throw new ArithmeticException();
		// throw new StackOverflowError();
		
	}

	public static void main(String[] args) {
		try {
			divide();

		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (StackOverflowError e) {
			System.out.println(e.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
