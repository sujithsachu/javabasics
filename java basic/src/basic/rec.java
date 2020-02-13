package basic;

public class rec {

	public static void main(String[] args) {
		int i=9;
		int sum=0;
		int rem;
		int square=i*i;
		while(square!=0)
		{
			
			sum=sum+square%10;
			square=square/10;
			
		}
	
		if(sum==i)
		{
			System.out.println("its neon number");
		}
		else
		{
			System.out.println("its not neon number");
		}
		
	

	}



}
