package basic;

public class detobi {

	public static void main(String[] args) {
       int deci=3;
       String binary="";
  
       while(deci!=0)
       {
   
    	   binary=binary+deci%2;
    	   deci=deci/2;
    	   
       }
       System.out.println(binary);

	}

}
