package calculatorApp;
import java.io.*;
class UseCalculator {

	public static void main(String[] args) throws java.io.IOException {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("select the calculator: Basic-B or Scientific-S");
		System.out.flush();
		String option=buffer.readLine();
		if(option.length()==1) {
			if(option.equals("B")||option.equals("b")) {
				Calculator c=new Calculator();
				c.Calc();
			}
			else if(option.equals("S")||option.equals("s"))
			{
				ScientificCalculator sc=new ScientificCalculator();
				sc.Calc();
			}
			else {
				System.out.println("enter option 'B' or 'S':");
			}
		}
		else {
			System.out.println("enter option 'B' or'S':");
		}

	}

}
