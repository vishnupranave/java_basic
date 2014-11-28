class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}

public class LearnUserDefinedException {

	public static void main(String[] args) {

		try {
			throw new MyException("An Exception occured");
		} catch (MyException e) {
			System.out.println(e);
		}
	}

}
