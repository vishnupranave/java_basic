package demo1;

import java.io.File;
import java.io.IOException;

public class CreatingFiles {

	public static void main(String[] args) {
		try{
			File file = new File("test.txt");
			if(file.createNewFile()){
				System.out.println("New File created");
			}
			else System.out.println("Cannot create file!");
			
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}
}
