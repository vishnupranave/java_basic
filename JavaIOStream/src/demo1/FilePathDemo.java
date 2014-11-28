package demo1;

import java.io.File;
import java.io.IOException;

public class FilePathDemo {
	private static String filename = "test.txt";
	private static String workingDir = "";

	public static void main(String[] args) {
		try {
			File file = new File(filename);
			workingDir = System.getProperty("user.dir");
			if (file.createNewFile()) {
				System.out.println("New File created at");
				System.out.println("path: " + workingDir + "/" + filename);
			} else {
				System.out.println("Cannot create file at");
				System.out.println("path: " + workingDir + "/" + filename);
			}

		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}
