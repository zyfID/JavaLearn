package Homework16;

import java.lang.reflect.*;

public class Qus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * @author zyf-PC
		 * 测试getClass()和getComponentType()的输出类型
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
		//获得源数组的数据类型
		Class componentType = array.getClass().getComponentType();
		
		//创建一个和源数组同数据类型、长度为length的数组
		newArray = Array.newInstance(componentType, length);
		
		//将源数组中的元素拷贝到新数组中
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
