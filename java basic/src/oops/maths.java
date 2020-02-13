package oops;

public class maths {
    static float pi=3.14f;
	static String creater="Narayanaguru college";
	static int earning=55000;

	
	

	public static void main(String[] args) {
		maths operation=new maths();
		int a=operation.add(1,2);
		System.out.println("adding:"+a);
		int b=operation.fact(5);
		System.out.println("factorial:"+b);
		int c=operation.rever(657);
		System.out.println("reverse number:"+c);
		int d=operation.sumd(555);
		System.out.println("sum of digits:"+d);
		int e=operation.sus(6);
		System.out.println("sum of series:"+e);
		int f=operation.table(5);
		System.out.println("tables:"+f);
		operation.armstrong(121);
		operation.neon(24);
		
		
		
		

	}

	private void neon(int i) {
		int sum=0;
        int square=i*i;
		while(i!=0)
		{
			
			sum=sum+square%10;
			square=square/10;
		}
		if(sum==i)
		{
			System.out.println("The number is neon number");
		}
		else
		{
			System.out.println(" the number is not neon number");
		}
		
	}

	public void armstrong(int i) {
		int j,rem;
		int sum=0;
		while(i>0)
		{
			rem=i%10;
			sum=sum+(rem*rem*rem);
			i=i/10;
	   }
		if (i==sum)
		{
			System.out.println("this number is armstrong");
		}
		else
		{
			System.out.println("this number not armstrong");
		}
		
	
		
	}

	private int table(int i) {
		int j,sum = 0;
		for(j=1;j<=10;j++)
		{
			sum=j*i;
			System.out.println(sum);		
					
		}
		return sum;
		
		
	}

	private int sus(int i) {
		int sum=0;
		int j;
		for(j=1;j<=i;j++)
		{
			sum=sum+j;
		}
		return sum;
	
		
	}

	private int sumd(int i) {
		int sum=0;
		int rem;
		while(i>0)
		{
			rem=i%10;
			sum=sum+rem;
			i=i/10;
		}
		return sum;
		
	}

	private int rever(int i) {
		int sum=0;
		int rem;
		for(;i>0;)
		{
			rem=i%10;
			sum=sum*10+rem;
			i=i/10;
		}
		return sum;
	
		
	}

	private int fact(int i) {
		int sum=1;
		int j;
	for(j=1;j<=i;j++)
	{
		sum=sum*j;
	}
	return sum;
	
		
	}

	public int add(int i, int j) {
		int sum=i+j;
		return sum;
		
		
	}

}
