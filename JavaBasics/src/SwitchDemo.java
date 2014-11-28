import java.io.DataInputStream;
import java.io.IOException;

public class SwitchDemo {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		System.out.println("Enter a no between 0 and 9:");
		int no;
		DataInputStream in = new DataInputStream(System.in);
		no = Integer.parseInt(in.readLine());

		switch (no) {
		case 0:
			System.out.println("You Entered Zero");
			break;
		case 1:
			System.out.println("You Entered One");
			break;
		case 2:
			System.out.println("You Entered Two");
			break;
		case 3:
			System.out.println("You Entered Three");
			break;
		case 4:
			System.out.println("You Entered Four");
			break;
		case 5:
			System.out.println("You Entered Five");
			break;
		case 6:
			System.out.println("You Entered Six");
			break;
		case 7:
			System.out.println("You Entered Seven");
			break;
		case 8:
			System.out.println("You Entered Eight");
			break;
		case 9:
			System.out.println("You Entered Nine");
			break;
		default:
			System.out.println("You entered wrong input");
			break;
		}
	}

}
