public class LoopingDemo {

	public static void main(String[] args) {
		// Entry Controlled
		for (int i = 0; i < 5; i++)
			System.out.println("Value of i = " + i);
		int j = 5;

		// Entry Controlled
		while (j > 0) {

			System.out.println("Value of j = " + j);
			j--;
		}

		// Exit Controlled
		do {
			System.out.println("Value of j = " + j);
			j++;
		} while (j < 6);

		// Enhanced for loop
		String names[] = { "PRANAVE", "K", "V" };
		for (String n : names)
			System.out.print(n + " ");
	}

}
