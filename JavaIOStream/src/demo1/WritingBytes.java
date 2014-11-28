package demo1;

import java.io.FileOutputStream;
import java.io.IOException;

public class WritingBytes {
	public static void main(String[] args) throws IOException {
		
		String string = "This is a string.\nI am writing this string to a file";
		byte b[] = string.getBytes();
		
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("output.txt");
			out.write(b);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null)
				out.close();

		}
	}

}
