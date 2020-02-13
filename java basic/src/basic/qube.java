package basic;

public class qube {

	public static void main(String[] args) {
		int a=1;
		int b=5;
		int i;
		int p;
		for(p=1;p<=b;p++)
		{
			int v=1;
			for(i=1;i<=p;i++)
			{
				v=v*p;
			}
			System.out.println(v);
		}

	}

}
