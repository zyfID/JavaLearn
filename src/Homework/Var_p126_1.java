package Homework;

import java.util.Arrays;

public class Var_p126_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var_p126_1 copy = new Var_p126_1();
		int[] arr1 = new int[] {1,2,3,4,5,6,7};
		int[] arr2 = Arrays.copyOfRange(arr1, 0, 3);
		
		copy.showArray(arr1);
		copy.showArray(arr2);
		

	}
	
	//打印数组函数
	public void showArray(int[] array) {
		for(int x:array) {
			System.out.print(x+" ");
		}
		
		System.out.println();
	}

}
