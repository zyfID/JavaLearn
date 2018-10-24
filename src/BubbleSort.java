
public class BubbleSort {
	public static void main(String[] args) {
		int array[] = new int[] {63,4,24,1,3,15};
		BubbleSort sorter = new BubbleSort();
		sorter.sort(array);
		
	}
	
	//定义冒泡排序方法的函数
	public void sort(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-1; j++) {
				if (array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		showArray(array);
	}
	
	//打印数组中的元素
	public void showArray(int[] array) {
		for(int x : array) {
			System.out.print(x+" ");
		}
		
		System.out.println();
	}

}
