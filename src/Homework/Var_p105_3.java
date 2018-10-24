package Homework;

public class Var_p105_3 {
	public static void main(String[] args) {
		String text = "17788253406";
		
		//先弄清楚合法手机号码的格式
		//String regex = "\\d{11}";
		 String regex = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$";
		
		if (text.matches(regex)) {
			System.out.println(text+"是合法的手机号码");
		}else {
			System.out.println(text+"不是合法的手机号");
		}
	}

}
