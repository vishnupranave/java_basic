import java.io.DataInputStream;
import java.io.IOException;

public class ReadingKeyboardInput {

	public static void main(String[] args) throws IOException {

		System.out.println("Reading Input from Keyboard");
		System.out.println("Enter a string :");
		String s="";
		DataInputStream in = new DataInputStream(System.in);
		s = in.readLine();
		System.out.println("String : " + s);
		
		System.out.println("Enter an Integer :");
		int i = 0;
		i = Integer.parseInt(in.readLine());
		System.out.println("Integer i : " + i);
		
		System.out.println("Enter a float :");
		float f = 0.0f;
		f = Float.valueOf(in.readLine()).floatValue(); 
		System.out.println("Float f : " + f);
	}

}
