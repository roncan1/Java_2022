package question_b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[scanner.nextInt()];
		int need = scanner.nextInt();
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0+i; j < array.length; j++) {
				if (array[i] + array[j] == need && array[i]+array[j] != 0) {
					count++;
					array[i] = 0;
					array[j] = 0;
				}
			}
		}
		
		System.out.println(count);
		
	}
	

}
/*
 * i와 하나의 요소를 비교하여 합이 9가 된다면 카운트를 1높여주고
 * 두개의 원소를 제외*/
