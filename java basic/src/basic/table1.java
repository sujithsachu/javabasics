package basic;

public class table1 {

	public static void main(String[] args) {
	 table1 mult=new table1();
	 mult.table();
	 

	}
	int a=1;
	int c;
	int i=7;

	private void table() {
	
		if(a<=10)
		{
			c=a*i;
			System.out.println(c);
			a++;
	 	table();
		
	}

	}
}
