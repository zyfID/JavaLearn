package Homework;

public class Var_p105_3 {
	public static void main(String[] args) {
		String text = "17788253406";
		
		//��Ū����Ϸ��ֻ�����ĸ�ʽ
		//String regex = "\\d{11}";
		 String regex = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$";
		
		if (text.matches(regex)) {
			System.out.println(text+"�ǺϷ����ֻ�����");
		}else {
			System.out.println(text+"���ǺϷ����ֻ���");
		}
	}

}
