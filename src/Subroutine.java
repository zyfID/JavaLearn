
public class Subroutine extends SubParent {
	
	Subroutine() {
		// TODO Auto-generated constructor stub
		System.out.println("调用子类的SubParent()构造方法");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subroutine s = new Subroutine();
		System.out.println();
		System.out.println(s.getClass().getName());

	}

}
