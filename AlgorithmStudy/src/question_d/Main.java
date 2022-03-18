package question_d;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int[] t = new int[scanner.nextInt()];
        int[] arr = new int[t.length];
        int[] tempArr = new int[t.length];
        
        for (int i = 0; i < t.length; i++) {
			arr[i] = scanner.nextInt();
			tempArr[i] = arr[i];
		}
        
        int[] result = new int[t.length];
        quickSort(arr, 0, arr.length-1);
        int count = 0;
        while (count < arr.length) {
			for (int j = 0; j < tempArr.length; j++) {
				if (arr[count] == tempArr[j]) {
					result[j] = count;
					j = tempArr.length;
				}
			}	
			count++;
		}
        
        
        for (int i = 0; i < result.length; i++) {
        	System.out.print(result[i] + " ");
		}
        
        
        
}

	
	private static void quickSort(int[] arr, int start, int end) {
		int part = partition(arr, start, end); // ���� ��Ƽ�ǿ��� �ǹ� �ٷ� ������ ���� ����
		if (start < part - 1) {
			quickSort(arr, start, part - 1); // ��� ���� ����
		}
		if (end > part) {
			quickSort(arr, part, end); // ��� ������ ����
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2]; // ��� ���� �ǹ�����
		while (start <= end) {
			// �ǹ��� ��
			while (arr[start] < pivot)
				start++;
			while (arr[end] > pivot)
				end--;

			// ����
			if (start <= end) {
				swap(arr, start, end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
