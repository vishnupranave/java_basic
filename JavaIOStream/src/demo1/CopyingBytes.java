package demo1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingBytes {
public static void main(String[] args) throws IOException {
	File in = new File("input.txt");
	File out = new File("output.txt");
	FileInputStream fin = null;
	FileOutputStream fout =null; 
	try {
		fin = new FileInputStream(in);
		fout = new FileOutputStream(out);
		int ch;
		while((ch = fin.read())!=-1){
			fout.write(ch);
			
		}
		System.out.println("File Copy Complete");
	
	} catch (Exception e) {
		
	}
	finally{
		if(fin!=null) fin.close();
		if(fout!=null) fout.close();
	}
}
}
