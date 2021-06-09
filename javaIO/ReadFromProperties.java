package javaIO;
import java.io.*;
import java.util.Properties;
public class ReadFromProperties {

	public static void main(String[] args) throws Exception{
		FileReader f=new FileReader("db.properties");
		
		Properties p=new Properties();
		p.load(f);
		
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));

	}

}
