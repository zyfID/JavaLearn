package Homework;

public class Var_p176_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
//		int m = 2;
//		int n = 32;
		int arr[] = new int[6];
		for(int i=0; i<6; i++) {
			int s = 2 + (int)(Math.random()*(30));
			if (s%2==0) {
				arr[i] = s;
			}
			
			sum = sum + arr[i];
		}
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("ºÍÊÇ£º"+sum);
		

	}

}
