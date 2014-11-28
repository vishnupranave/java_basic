public class LearnMultipleCatch {

	public static void main(String[] args) {
		int x;
		try {
			x = 7 / 0;
		} catch (StackOverflowError e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
