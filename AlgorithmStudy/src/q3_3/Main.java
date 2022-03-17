package q3_3;

public class Main {
//	병합정렬
	public static void main(String[] args) {
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		print(arr);
		System.out.println();
		System.out.println();
		mergeSort(arr);
		print(arr);
	}
	
	static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length]; 
		mergeSort(arr, tmp, 0, arr.length-1);
	}
	static void mergeSort(int[] arr, int[] tmp, int start, int end){
		if (start < end) {
			int mid = (start + end)/2;
			mergeSort(arr, tmp, start, mid);
			mergeSort(arr, tmp, mid + 1, end);
			merge(arr, tmp, start, mid, end);
		}
	}
	
	static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		for (int i = start; i <= end; i++) {
			tmp[i] = arr[i];
		}
		
		int part1 = start,
			part2 = mid + 1,
			index = start;
		
		while (part1 <= mid && part2 <= end) {
			if (tmp[part1] <= tmp[part2]) {
				arr[index] = tmp[part1];
				part1++;
			} else {
				arr[index] = tmp[part2];
				part2++;
			}
			index++;
		}
		for (int i = 0; i <= mid - part1; i++) {
			arr[index + i] = tmp[part1 + i];
		}
		print(arr);
	}
	
	
	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(" ");
	}
	

}
