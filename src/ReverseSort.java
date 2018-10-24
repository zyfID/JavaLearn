
public class ReverseSort {
	//������
	public static void main(String[] args) {
		int[] array = new int[] {10,20,30,40,50,60,70};
		ReverseSort sorter = new ReverseSort();
		sorter.showArray(array);
		sorter.sort(array);
		
	}
	
	
	//��ת������
	public void sort(int[] array) {
		int num = array.length/2;
		for(int i=0; i<num; i++) {
			int max = array.length-i-1;
			int temp = array[i];
			array[i] = array[max];
			array[max] = temp;
		}
		
		showArray(array);
	}
	
	
	//��ӡ����Ԫ��
	public void showArray(int[] array) {
		for(int x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

}
