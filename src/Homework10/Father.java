package Homework10;

public abstract class Father {
	
	/**
	 * 第二题内容
	public void draw(Father f) {
		System.out.println("这是父类的方法");
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
