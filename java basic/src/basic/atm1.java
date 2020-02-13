package basic;
import java.util.Scanner;


public class atm1 {
	private static Scanner in;
	private static  float balance=0;

	public static void main(String[] args) {
	in=new Scanner(System.in);
	tranaction();

	}

	private static void tranaction() {
	int choice;
	System.out.println("Please select the option:");
	System.out.println("withdraw:");
	System.out.println("deposit:");
	System.out.println("balance:");
	choice=in.nextInt();
	switch(choice)
	{
	case 1:
		float amount;
		System.out.println("Enter the amount");
		amount=in.nextFloat();
		if(amount>balance||balance==0)
		{
			System.out.println("insufficent fund");
			anothertransaction();
		}
		else
		{
			balance=balance-amount;
			System.out.println("you withdraw amount:"+amount+"new balance:"+balance);
			anothertransaction();
			break;
		}
	case 2:
		float deposit;
		System.out.println("Enter the deposit amount:");
		deposit=in.nextFloat();
		balance=deposit+balance;
		System.out.println("your deposit amount:"+deposit+"your new balance:"+balance);
		anothertransaction();
		break;
	case 3:
	System.out.println("your balance:"+balance);
	anothertransaction();
	break;
	default:
		System.out.println("invalid tranaction");
	}
		
	}

	private static void anothertransaction() {
		System.out.println("thanks for choice the atm");
	
		
	}

}
