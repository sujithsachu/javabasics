package basic;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		System.out.println("Enter the tow values");
		Scanner A=new Scanner(System.in);
		double first=A.nextDouble();
		double second=A.nextDouble();
		System.out.println("enter the oprator(+,-,*,/:");
		char opreater=A.next().charAt(0);
		double result;
		switch (opreater)
		{
			case '+':
				result=first+second;
				break;
			case'-':
				result=first-second;
				break;
			case '*':
				result=first*second;
				break;
			case'/':
			    result=first/second;
			break;
			default:
				System.out.println("enter the value is not correct");
			return;
		}
		System.out.println(result);
				
	

	}

}
