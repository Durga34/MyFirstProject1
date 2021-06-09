package javaIO;

import java.io.FileInputStream;

public class ReadFileUsingInputStream  {

	public static void main(String[] args) {
	    try {
	    	FileInputStream f=new FileInputStream("D:\\testin.txt");
	    	int i=f.read();
	    	System.out.println((char)i);
	    	
	    	f.close();
	    }catch(Exception e) {
	    	System.out.println(e);
	    }

	}

}
