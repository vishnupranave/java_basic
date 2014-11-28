import java.io.DataInputStream;
import java.io.IOException;

public class DecisionDemo {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		boolean b = true;
		if (b)
			System.out.println("This will be displayed!");
		else
			System.out.println("This will not be displayed!");

		b = !b;
		if (b)
			System.out.println("This will not be displayed!");
		else
			System.out.println("This will be displayed!");

		if (5 < 10) {
			if (1 < 5)
				System.out.println("This will be displayed!");
			else
				System.out.println("This will not be displayed!");
		} else
			System.out.println("This will not be displayed!");

		int i = 0;
		DataInputStream in = new DataInputStream(System.in);

		System.out.println("Enter a no: ");
		i = Integer.parseInt(in.readLine());
		if (i >= 0 && i <= 5)
			System.out.println("i between 0 and 5");
		else if (i > 5 && i <= 10)
			System.out.println("i between 5 and 10");
		else if (i > 10 && i <= 15)
			System.out.println("i between 10 and 15");
		else if (i > 15 && i <= 20)
			System.out.println("i between 15 and 20");
		else
			System.out.println("i greater than 20");
	}

}
