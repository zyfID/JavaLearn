package Homework;

public class Var_p79_3 {
	public static void main(String args[]) {
		float sum = 0;
		int mul = 1;
		float x;
		
		for(int i = 1; i <= 20; i ++) {
			mul = i * mul;
			x = (float)1/mul;
			sum = sum + x;
		}
		System.out.println(sum);
		
//	      double sum = 0,a = 1;
//	      int i = 1;
//	      while(i <= 20)
//	      {
//	    	  sum = sum+a;
//	    	  i = i+1;
//	    	  a = a*(1.0/i);
//	      }
//	      System.out.println(sum);
	}

}
