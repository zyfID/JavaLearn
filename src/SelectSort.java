
public class SelectSort {
	
	//主函数
	public static void main(String[] args) {
		int[] array = new int[] {63,4,24,1,3,15};
		SelectSort sorter = new SelectSort();
		sorter.sort(array);
	}
	
	//直接排序函数
	public void sort(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			int m = array.length-i-1;
			for(int j=0; j<m+1; j++) {
				if (array[j]>array[m]) {
					int temp = array[j];
					array[j] = array[m];
					array[m] = temp;
				}
			}
		}
		
		showArray(array);
	}
	
	//打印数组元素的函数
	public void showArray(int[] array) {
		for(int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
