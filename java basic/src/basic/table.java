package basic;
import java.util.Scanner;




public class table {
	private static Scanner in;
	public static void main(String[] args)
	{
		
		in=new Scanner(System.in);
		System.out.println("Enter the tables");
		int tablenum=in.nextInt();
		int i,j;
		for(i=1;i<=10;i++)
		{
			j=i*tablenum;
			System.out.println(j);
		}
		
		
	}

}
