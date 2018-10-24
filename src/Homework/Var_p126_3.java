package Homework;

import java.util.*;

public class Var_p126_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Var_p126_3 search = new Var_p126_3();
		String[] arr1 = new String[] {"a","b","c","d","e","f"};
		search.showArray(arr1);
		
		Arrays.fill(arr1,2,3,"bb");;
		search.showArray(arr1);

	}
	
	public void showArray(String[] array) {
		for(String x:array) {
			System.out.print(x+" ");
		}
		
		System.out.println();
	}

}
