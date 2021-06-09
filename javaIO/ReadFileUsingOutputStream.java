package javaIO;

import java.io.FileOutputStream;

public class ReadFileUsingOutputStream {

	public static void main(String[] args) {
		try {
			FileOutputStream f1=new FileOutputStream("D:\testout.txt");
			f1.write(5);
			f1.close();
			System.out.println("success");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
