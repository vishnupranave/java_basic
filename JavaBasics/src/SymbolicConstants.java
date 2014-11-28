public class SymbolicConstants {

	final static double PI = 3.141523;
	static final double newPI = 3.141523;

	/*
	 * What is the difference between final static & static final
	 */
	public static void main(String[] args) {

		System.out.println("PI = " + PI);
		// PI=22/7; // PI cannot be changed
		// newPI=22/7; // newPI cannot be changed
		System.out.println("newPI = " + newPI);

	}

}
