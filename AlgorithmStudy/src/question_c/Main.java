package question_c;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int tempA = scanner.nextInt();
			int tempB = scanner.nextInt();
			int r = 1;
			for (int j = 0; j < tempB; j++) {
				r *= tempA;
				r %= 10;
			}
			if(r==0) r=10;
			System.out.println(r);
		}
	}
	
}
