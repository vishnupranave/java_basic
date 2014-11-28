public class MathDemo {

	public static void main(String[] args) {

		double x = 0, a = 2, b = 10, c = 3.14;
		System.out.println("Sin(" + x + ") =" + Math.sin(x));
		System.out.println("Cos(" + x + ") =" + Math.cos(x));
		System.out.println("Tan(" + x + ") =" + Math.tan(x));

		System.out.println("Power(" + a + "," + b + ") = " + Math.pow(a, b));
		System.out.println("Celing(" + c + ") = " + Math.ceil(c));
		System.out.println("Floor(" + c + ") = " + Math.floor(c));

		System.out.println("Truncate(" + c + ") = " + Math.rint(c));
		System.out.println("Round(" + c + ") = " + Math.round(c));

		System.out.println("Absolute(" + c + ") = " + Math.abs(c));
		System.out.println("Maximum(" + a + "," + b + ") = " + Math.max(a, b));
		System.out.println("Minimum(" + a + "," + b + ") = " + Math.min(a, b));
	}

}
