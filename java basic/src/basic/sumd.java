package basic;

public class sumd {

	public static void main(String[] args) {
		sumd s=new sumd();
		s.rev();
		


	}
	int i=653;

	private void rev() {
		if(i!=0)
		{
			int sum=0;
			sum=sum+i%10;
			i=i/10;
			System.out.print(sum);
			rev();
	
		}
		
	
	
		
	}

}
