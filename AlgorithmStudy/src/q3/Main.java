package q3;

public class Main {
	public static void main(String[] args) {
//		��������
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
//		int standard = arr[i];  // ����
//		int aux = i - 1;   // ���� ���
//
//		while (aux >= 0 && standard < arr[aux]) {
//			arr[aux + 1] = arr[aux];   // �񱳴���� ū ��� ���������� �о
//			aux--;
//		}
//		arr[aux + 1] = standard;  // ���ذ� ����
//	}

}
