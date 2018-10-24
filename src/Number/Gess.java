package Number;

public class Gess {
	public static void main(String[] args) {
		char word = 'd', word2 = '@';
		int p = 23045 , p2 = 45213;
		System.out.println("d在unicode表中顺序:" + (int)word);
		System.out.println("@在unicode表中顺序:" + (int)word2);
		System.out.println("Unicode表中23045是:" + (char)p);
		System.out.println("unicode表中45213是:" + (char)p2);
	}

}
