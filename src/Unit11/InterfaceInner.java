package Unit11;

interface OutInterface{
	public void f();
}


class OuterClass2{
	private class InnerClass implements OutInterface{
		public InnerClass(String s) {
			// TODO Auto-generated constructor stub
			System.out.println(s+"test");
		}
		
		public void f() {
			System.out.println("访问内部类中f()方法");
		}
	}
	
	public OutInterface doit() {
		return new InnerClass("访问内部类构造方法");
	}
}

public class InterfaceInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass2 out = new OuterClass2();
		OutInterface outinter = out.doit();
		outinter.f();

	}

}
