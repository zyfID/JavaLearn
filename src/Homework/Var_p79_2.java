package Homework;

public class Var_p79_2 {
	public static void main(String args[]) {
		int lineCount = 19;
		int midlineCount = (lineCount + 1)/2;
		
		for(int i = 1; i <= midlineCount; i++) {
			for(int space = i; space<midlineCount; space++) {
				System.out.print(" ");
			}
			
			for(int start=1; start<=2*i-1; start++) {
				System.out.print("*");

			}
			System.out.print("\n");
		}
		
		for(int j = midlineCount+1; j <= lineCount; j++) {
			for(int space = j; space-midlineCount > 0; space--) {
				System.out.print(" ");
			}
			
			for(int start = 1; start <= 4*midlineCount-2*j-1; start++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		}
	}


