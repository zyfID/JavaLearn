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
			System.out.println("�����ڲ�����f()����");
		}
	}
	
	public OutInterface doit() {
		return new InnerClass("�����ڲ��๹�췽��");
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
