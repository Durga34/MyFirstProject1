package calculatorApp;
import java.io.*;
class Calculator {
	public void Calc() throws java.io.IOException
	{
		boolean next;
		do
		{
			Integer iFirstNumber=new Integer(0);
			Integer iSecondNumber=new Integer(0);
			BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter first no: ");
			System.out.flush();
			try
			{
				iFirstNumber=Integer.parseInt(buffer.readLine());
			}
			catch(NumberFormatException e)
			{
				System.out.println("provide numeric values");
				System.exit(0);
			}
			System.out.println("please enter the operation(Add: '+',Minus:'-',product:'*',divide:'/'):");
			System.out.flush();
			String option=buffer.readLine();
			System.out.println("enter second no:");
			System.out.flush();
			try
			{
				iSecondNumber=Integer.parseInt(buffer.readLine(),10);
			}
			catch(NumberFormatException e) {
				System.out.println("***provide numeric values***");
				System.exit(0);
			}
			if(option.length()==1) {
				Calculate c=new Calculate(iFirstNumber,option.charAt(0),iSecondNumber);
				c.doCalculation();
				c.getResult();
			}
			else {
				System.out.println("***operation not available***");
			}
			System.out.println("would you like to calculate again(y/n)?");
			System.out.flush();
			char response=(char)buffer.read();
			if((response=='y')||(response=='Y')) {
				next=false;
				
			}
			else {
				next=true;
			}
		}while(!next);
	}

}
