package Homework;

//import java.util.*;

public class Var_p126_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int len = arr.length;
		//System.out.println(len);
		for(int i=0; i<len; i++){
			for(int j=i; j<arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}


	}
	

}
