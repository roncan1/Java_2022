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
 * i�� �ϳ��� ��Ҹ� ���Ͽ� ���� 9�� �ȴٸ� ī��Ʈ�� 1�����ְ�
 * �ΰ��� ���Ҹ� ����*/
