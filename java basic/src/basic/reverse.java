package basic;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		int b,rem;
		int sum=0;
		System.out.println(" enter the reverse number");
		Scanner a=new Scanner(System.in);
		 b=a.nextInt();
		while(b>0)
		{
			rem=b%10;
			sum=(sum*10)+rem;
			b=b/10;
			
		}
		System.out.println("reversed number:"+sum);
		
		
		

	}

}
