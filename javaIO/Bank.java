package javaIO;
import java.io.*;   
import org.apache.poi.hssf.usermodel.HSSFWorkbook;   
import org.apache.poi.ss.usermodel.Workbook;   
public class Bank  
{   
public static void main(String[] args) throws FileNotFoundException, IOException   
{      
Workbook wb = new HSSFWorkbook();   
OutputStream fileOut = new FileOutputStream("D:\\bank.xlsx");   
System.out.println("Excel File has been created successfully.");   
wb.write(fileOut);   
}   
}  