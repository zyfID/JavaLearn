package Homework10;

public abstract class Father {
	
	/**
	 * �ڶ�������
	public void draw(Father f) {
		System.out.println("���Ǹ���ķ���");
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	*/
	
	abstract void testAbstract();
	Father(){
		System.out.println("before testAbstract");
		testAbstract();
		System.out.println("after testAbstract");
	}
	
	public static void main(String args[]) {
		new Atest();
		
	}

}

class Atest extends Father{
	private int i = 1;
	void testAbstract() {
		System.out.println("testAbstract()"+i);
		
	}
	
	public Atest() {
		System.out.println(i);
	}
}
