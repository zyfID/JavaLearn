package Homework12;

class MyException extends Exception{
	String message;
	public MyException(String ErrorMessagr) {
		message = ErrorMessagr;
	}
	
	public String getMessage() {
		return message;
	}
}

class Student{
	static int speak(int m) throws MyException{
		if (m>1000) {
			throw new MyException("m的值应当小于等于1000");
		}
		
		return m;
	}
}

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		try {
			s.speak(1001);
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("程序发生了别的异常");
		}

	}

}
