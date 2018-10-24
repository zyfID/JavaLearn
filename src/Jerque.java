
public class Jerque {
	public static void main(String[] args) {
		String str1 = "";
		long starTime = System.currentTimeMillis();
		for (int i=0; i<10000; i++) {
			str1 = str1 + i;
		}
		long endTime = System.currentTimeMillis();
		long time = endTime - starTime;
		System.out.println("+的时间是："+time);
		
		StringBuilder build = new StringBuilder("");
		starTime = System.currentTimeMillis();
		for(int j=0; j<10000; j++) {
			build.append(j);
		}
		endTime = System.currentTimeMillis();
		time = endTime - starTime;
		System.out.println("builder方法消耗时间是："+time);
		
		
	}

}
