public class OperatorsDemo {

	public static void main(String[] args) {

		int a = 22, b = 7;
		// Arithmetic Operators
		System.out.println("a + b = " + (a + b)); // Addition
		System.out.println("a - b = " + (a - b)); // Subtraction
		System.out.println("a * b = " + (a * b)); // Multiplication
		System.out.println("a / b = " + (a / b)); // Division
		System.out.println("a % b = " + (a % b)); // Modulo

		// Relational Operators
		System.out.println("a < b = " + (a < b)); // less than
		System.out.println("a > b = " + (a > b)); // greater than
		System.out.println("a == b = " + (a == b)); // equal to
		System.out.println("a <= b = " + (a <= b)); // less than or equal to
		System.out.println("a >= b = " + (a >= b)); // greater than or equal to
		System.out.println("a != b = " + (a != b)); // not equal

		// Logical Operators
		boolean boola = true, boolb = false;
		System.out.println("boola && boolb = " + (boola && boolb)); // AND
		System.out.println("boola || boolb = " + (boola || boolb)); // OR
		System.out.println("! boola  = " + (!boola)); // NOT

		// Increment and Decrement
		System.out.println("a = " + a);
		System.out.println("a++ = " + a++); // post-increment
		System.out.println("a = " + a);
		System.out.println("++a = " + ++a); // pre-increment
		System.out.println("b = " + b);
		System.out.println("b-- = " + b--); // post-decrement
		System.out.println("b = " + b);
		System.out.println("--a = " + --b); // pre-decrement

		// Bitwise operator
		int x = 0x00, y = 0xFF;
		System.out.println("x & y = " + (x & y)); // bitwise AND
		System.out.println("x | y = " + (x | y)); // bitwise OR
		System.out.println("x ^ y = " + (x ^ y)); // bitwise XOR
		System.out.println("y << 1 = " + (y << 1)); // shift left by n
		System.out.println("y >> 1 = " + (y >> 1)); // shift right by n
		System.out.println("y >>> 8 = " + (y >>> 8)); // shift right with fill 0
		System.out.println("~y = " + (~y)); // one's complement

	}

}
