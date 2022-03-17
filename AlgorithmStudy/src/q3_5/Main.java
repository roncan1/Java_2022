package q3_5;

public class Main {
//	��������
	public static void main(String[] args) {
		int[] array = {3,9,4,7,5,0,1,6,8,2};
		selection_sort(array, array.length);
	}
	private static void selection_sort(int[] array, int size) {

		for (int i = 0; i < size - 1; i++) {
			int min_index = i;

			// �ּڰ��� �����ִ� �ε��� ã��
			for (int j = i + 1; j < size; j++) {
				if (array[j] < array[min_index]) {
					min_index = j;
				}
			}

			// i��° ���� ã�� �ּڰ��� ���� ��ȯ
			swap(array, min_index, i);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
