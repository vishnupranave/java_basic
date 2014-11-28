public class TypeCastingDemo {

	public static void main(String[] args) {
		char c = 'A';
		byte b = 100;
		short s = 1000;
		int i = 721000;
		long l = 21323L;
		float f = 3000.98f;
		double d = 8998989.123123;
		System.out.println("c = " + c);
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);

		short s1 = (short) b;
		short s2 = (short) i; // produce wrong output because size of short <
								// integer
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);

		float f1 = (float) d;
		System.out.println("f1 = " + f1); // fractional part is lost
	}

}
