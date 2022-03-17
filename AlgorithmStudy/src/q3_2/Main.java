package q3_2;

public class Main {
//	������
	public static void main(String[] args) {
		int[] arr = { 7, 4, 2, 8, 3, 5, 1, 6};
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
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
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		return start;
	}

	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
		return;
	}

}
