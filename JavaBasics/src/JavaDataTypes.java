public class JavaDataTypes {

	public static void main(String[] args) {
		System.out.println("Java Data Types");

		byte b = 100;
		System.out.println("Byte b = " + b);
		b = 127;
		System.out.println("Byte b = " + b);
		// b=256; Cause Exception because byte is 8bit, 256 has 9bits
		System.out.println("Byte b = " + b);

		short s = 10000; // -(2^15) to (2^15-1)
		System.out.println("Short s = " + s);

		int i = 730000; // -(2^31) to (2^31-1)
		System.out.println("Integer i = " + i);
		int hexa=0x64;
		System.out.println("Int hexa = " + hexa);

		long l = 100000000; // -(2^61) to (2^61-1)
		System.out.println("Long l = " + l);

		float f = 12.09f; // 4 bytes
		System.out.println("Float f = " + f);
		f = 12.0000000000000000000000000000000000000009f; // No good precision
		System.out.println("Float f = " + f);

		double d = 12345678.12345678d;
		System.out.println("Double d = " + d);

		boolean bool = true;
		System.out.println("Boolean bool = " + bool);
		
		char c = 'A';
		System.out.println("Char c = " + c);
		c='\u0061';
		System.out.println("Char c = " + c);
		
	}

}
