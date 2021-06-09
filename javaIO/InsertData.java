package javaIO;
import  java.io.*;  
import  org.apache.poi.hssf.usermodel.HSSFSheet;  
import  org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import  org.apache.poi.hssf.usermodel.HSSFRow;  
public class InsertData
{  
public static void main(String[]args)   
{  
try   
{  
String filename = "D:\\bank.xlsx";    
HSSFWorkbook workbook = new HSSFWorkbook();  

HSSFSheet sheet = workbook.createSheet("January");   

HSSFRow rowhead = sheet.createRow((short)0);  
  
rowhead.createCell(0).setCellValue("S.No.");  
rowhead.createCell(1).setCellValue("Customer Name");  
rowhead.createCell(2).setCellValue("Account Number");  
rowhead.createCell(3).setCellValue("e-mail");  
rowhead.createCell(4).setCellValue("Balance");  
HSSFRow row = sheet.createRow((short)1);  
row.createCell(0).setCellValue("1");  
row.createCell(1).setCellValue("John William");  
row.createCell(2).setCellValue("9999999");  
row.createCell(3).setCellValue("william.john@gmail.com");  
row.createCell(4).setCellValue("700000.00");  
HSSFRow row1 = sheet.createRow((short)2);  
row1.createCell(0).setCellValue("2");  
row1.createCell(1).setCellValue("Mathew Parker");  
row1.createCell(2).setCellValue("22222222");  
row1.createCell(3).setCellValue("parker.mathew@gmail.com");  
row1.createCell(4).setCellValue("200000.00");  
FileOutputStream fileOut = new FileOutputStream(filename);  
workbook.write(fileOut);    
fileOut.close();    
workbook.close();    
System.out.println("Excel file has been generated successfully.");  
}   
catch (Exception e)   
{  
e.printStackTrace();  
}  
}  
}  
