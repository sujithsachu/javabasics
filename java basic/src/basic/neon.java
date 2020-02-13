package basic;

public class neon {

	public static void main(String[] args) {
		int i=9;
        int square=i*i;
        int sum=0;
		while(square!=0)
        {
			sum=sum+square%10;
			square=square/10;
        }
		System.out.println(sum);
		
		if(sum==i)
		{
			System.out.println("The number is neon number");
		}
		else
		{
			System.out.println(" the number is not neon number");
		}

	    }

	
}
