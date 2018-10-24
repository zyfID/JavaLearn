
public class Division {
	public static void main(String[] args) {
		String str = "192.168.0.1";
		String[] firststr = str.split("\\.");
		String[] secondstr = str.split("\\.",2);
		
		System.out.println(str);
		for(String a : firststr) {
			System.out.print("["+a+"]");
		}
		
		System.out.println();
		
		for(String a : secondstr ) {
			System.out.print("["+a+"]");
		}
	}

}
