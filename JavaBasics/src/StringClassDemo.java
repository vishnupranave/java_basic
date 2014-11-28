public class StringClassDemo {

	public static void main(String[] args) {
		// Using String class
		String firstName = new String("Habi");
		String lastName = "S Ravi";
		System.out.println(firstName + " " + lastName);

		String s1 = "Hello";
		System.out.println(s1);
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		s2 = s2.toLowerCase();
		System.out.println(s2);
		s2 = s2.replace('h', 'H');
		System.out.println(s2);
		s2 = " hai hello world   ";
		System.out.println(s2);
		s2 = s2.trim();
		System.out.println(s2);
		System.out.println(s2.equals("hai hello world"));
		System.out.println(s2.equalsIgnoreCase("Hai HellO wOrld"));

		s1 = "hello4 hai hello";
		s2 = "hello3";
		System.out.println(s1.compareTo(s2));
		s1 = s1.concat(s2);
		System.out.println(s1);
		int a = 100;
		s2 = String.valueOf(a);
		System.out.println(s2);

		System.out.println(s1.indexOf('o'));
		System.out.println(s1.indexOf('o', 5));
		System.out.println(s1.charAt(15));
		System.out.println(s1.substring(15));
		System.out.println(s1.substring(15, 17));

	}
}
