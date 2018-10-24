//package Homework12;
//
//class MyException extends Exception{
//	String message;
//	public MyException(String ErrorMessagr) {
//		message = ErrorMessagr;
//	}
//	
//	public String getMessage() {
//		return message;
//	}
//}
//
//public class Computer {
//	
//	static int div(int a, int b) throws MyException{
//		if (a<0 || b<0) {
//			throw new MyException("输入不能为负数");
//		}
//		
//		return 1;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		try {
//			int s = div(3, -1);
//		} catch (MyException e) {
//			// TODO: handle exception
//			System.out.println(e.message);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("程序发生其他异常");
//		}
//
//	}
//
//}
