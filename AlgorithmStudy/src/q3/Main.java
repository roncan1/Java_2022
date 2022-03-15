package q3;

public class Main {
	public static void main(String[] args) {
//		삽입정렬
		int[] array = { 80, 50, 70, 10, 60, 20, 40, 30 };
		int j = 0;
		int i = 1;
		int tempA = 1;
		while (tempA < array.length) {
			while (j >= 0) {
				if (array[i] < array[j]) {
					int temp3 = array[j];
					array[j] = array[i];
					array[i] = temp3;
					i--;
				}
				j--;
			}
			i = ++tempA;
			j = i - 1;
		}
		for (int k = 0; k < array.length; k++)
			System.out.println(array[k]);
	}
	
	
//	for (int i = 1; i < arr.length; i++) {
//		int standard = arr[i];  // 기준
//		int aux = i - 1;   // 비교할 대상
//
//		while (aux >= 0 && standard < arr[aux]) {
//			arr[aux + 1] = arr[aux];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
//			aux--;
//		}
//		arr[aux + 1] = standard;  // 기준값 저장
//	}

}
