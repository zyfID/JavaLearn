package Homework;

public class Var_p105_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello world";
		String str2 = "we are student";
		String substr1 = str1.substring(0,3);
		String substr2 = str2.substring(0,5);
		
		boolean equal = substr1.equalsIgnoreCase(substr2);
		if (equal) {
			System.out.println("两个子串相等");
		}else {
			System.out.println("两个子串不相等");
		}
	}

}
