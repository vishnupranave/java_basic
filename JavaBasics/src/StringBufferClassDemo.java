public class StringBufferClassDemo {

	public static void main(String[] args) {

		// String class creates string of fixed length
		// StringBuffer class creates string of variable length
		StringBuffer str = new StringBuffer("Pranave");
		System.out.println(str);
		System.out.println(str.length());

		for (int i = 0; i < str.length(); i++)
			System.out.println(str.charAt(i));

		str.append("K V");
		System.out.println(str);
		str.insert(4, " S ");
		System.out.println(str);
		str.setCharAt(4, '.');
		str.setCharAt(6, '.');
		System.out.println(str);

	}

}
