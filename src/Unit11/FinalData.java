package Unit11;

import static java.lang.System.out;
import java.util.Random;

class Test{
	int i = 0;
}

public class FinalData {
	
	static Random rand = new Random();
	private final int VALUE_1 = 9;
	private static final int VALUE_2 = 10;
	private final Test test = new Test();
	private Test test2 = new Test();
	private final int[] a = {1,2,3,4,5,6};
	private final int i4 = rand.nextInt(20);
	private static final int i5 = rand.nextInt(20);
	public String toString() {
		return i4+" "+i5+" ";
	}
	
	public static void main(String args[]) {
		FinalData data = new FinalData();
//		data.test = new Test();
//		data.VALUE_2++;
		data.test2  = new Test();
//		for(int i=0; i<data.a.length; i++) {
//			a[i] = 9;
//			
//		}
//		
		out.println(data);
		out.println("data2");
		out.println(new FinalData());
		out.println(data);
	}

}
