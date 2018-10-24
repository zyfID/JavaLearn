package Homework12;


public class Number {
	
	static double count(double a, double b) {
		double c;
		c = a * b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			double c = count(3, 4);
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
