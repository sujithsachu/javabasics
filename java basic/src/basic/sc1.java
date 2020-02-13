package basic;
import java.util.Scanner;

public class sc1 {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("Enter the name,age,salary:");
	String name=a.nextLine();
	int age=a.nextInt();
	double salary=a.nextDouble();
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("salary:"+salary);

	}

}
