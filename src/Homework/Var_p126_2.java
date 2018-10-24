package Homework;

public class Var_p126_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[] {63,4,24,5,3,15};
		int min = arr1[0];
		for(int i =1; i<arr1.length-1; i++) {
			if (min>arr1[i]) {
				int temp = min;
				min = arr1[i];
				arr1[i] = temp;
			}
		}
		
		System.out.println(min);

	}

}
