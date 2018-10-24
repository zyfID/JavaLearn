
public class Judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String add1 = "12345";
		String add2 = "1548@";
		String add3 = "123@qq.com";
		String add4 = "123@11.ww.com";
				
		System.out.println(add1.matches(regex));
		System.out.println(add2.matches(regex));
		System.out.println(add3.matches(regex));
		System.out.println(add4.matches(regex));

	}

}
