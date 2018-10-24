import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int day[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
//		for(int i=0; i<12; i++) {
//			System.out.println((i+1)+"月有"+day[i]+"天");
//		}
		
//		int a[][] = new int[3][4];
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(a[i][j]);
//			}
//			
//			System.out.println();
//		}
//		
//		int b[][] = new int[][] {{1},{2,3},{4,5,6}};
//		for(int i=0; i<b.length; i++) {
//			for(int j=0; j<b[i].length; j++) {
//				System.out.print(b[i][j]);
//			}
//			
//			System.out.println();
//		}
		
		//使用foreach遍历二维数组
//		int arr2[][] = new int[][] {{4,3},{1,1}};
//		int i = 0;
//		for(int x[] : arr2) {
////			i++;
////			int j = 0;
//			for(int m : x) {
//				System.out.print(m+" ");
////				j++;
////				if (i==arr2.length && j==x.length) {
////					System.out.print(m);
////				}else {
////					System.out.print(m+"、");
////				}
//			}
//		}
		
		//填充替换
//		int arr[] = new int[] {23,42,12,8};
//		Arrays.fill(arr, 1, 2, 8);
//		for(int x : arr) {
//			System.out.println(x );
//		}
		
		//复制数组
		//看出普通遍历输出数组与foreach遍历输出的差别
//		int arr1[] = new int[] {23,42,12};
//		int newarr1[] = Arrays.copyOf(arr1, 5);
//		for(int x : arr1) {
//			System.out.print(x+" ");
//		}
//		System.out.println();
//		
//		for(int i=0; i<newarr1.length; i++) {
//			System.out.print(newarr1[i]+" ");
//		}
//		System.out.println();
//		
//		int arr2[] = new int[] {23,42,12,84,10};
//		int newarr2[] = Arrays.copyOfRange(arr2, 0, 3);
//		for(int x : arr2) {
//			System.out.print(x+" ");
//		}
		
		
		//数组查询
		int arr[] = new int[] {1,4,25,34,50,10};
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, 0, 1, 8);
		System.out.println(index);

	}

}
