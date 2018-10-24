package Homework16;

import java.lang.reflect.*;

public class Qus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * @author zyf-PC
		 * ����getClass()��getComponentType()���������
		int[] aa = {1,2,3};
		System.out.println(aa.getClass());
		System.out.println(aa.getClass().getComponentType());
		
		char[] ss = {'a','b','c'};
		System.out.println(ss.getClass());
		System.out.println(ss.getClass().getComponentType());
		*/
		
		
		Test test = new Test();
		
		test.print();
		
		test.is = (int[])addArrayLength(test.is, 10);
		test.ss = (String[])addArrayLength(test.ss, 10);
		
		test.print();

	}
	
	public  static Object addArrayLength(Object array, int length) {
		Object newArray = null;
		//���Դ�������������
		Class componentType = array.getClass().getComponentType();
		
		//����һ����Դ����ͬ�������͡�����Ϊlength������
		newArray = Array.newInstance(componentType, length);
		
		//��Դ�����е�Ԫ�ؿ�������������
		System.arraycopy(array, 0, newArray, 0, Array.getLength(array));
		
		return newArray;
	}

}

class Test{
	public int[] is = {1,2,3};
	public String[] ss = {"A","B","C"};
	
	public void print() {
		
		for(int i=0; i<is.length; i++) {
			System.out.println("is["+i+"]="+is[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<ss.length; i++) {
			System.out.println("ss["+i+"]="+ss[i]);
		}
		
		System.out.println();
	}
}
