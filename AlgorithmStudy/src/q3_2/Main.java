package q3_2;

public class Main {
//	퀵정렬
	public static void main(String[] args) {
		int[] arr = { 7, 4, 2, 8, 3, 5, 1, 6};
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	private static void quickSort(int[] arr, int start, int end) {
		int part = partition(arr, start, end); // 이전 파티션에서 피벗 바로 오른쪽 값을 리턴
		if (start < part - 1) {
			quickSort(arr, start, part - 1); // 재귀 왼쪽 정렬
		}
		if (end > part) {
			quickSort(arr, part, end); // 재귀 오른쪽 정렬
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2]; // 가운데 값을 피벗으로
		while (start <= end) {
			// 피벗과 비교
			while (arr[start] < pivot)
				start++;
			while (arr[end] > pivot)
				end--;

			// 스왑
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
