package q2;

public class Main {
	public static void main(String[] args) {
    int[] array = { 12, 25, 31, 48, 54, 66, 70, 83, 95, 108 };
    int find1 = 83;
    int location = 0;
    int minTemp = 0;
    int maxTemp = 9;
    int temp = array.length / 2;
    int repeatCount = 0;
    while (true) {
      if (find1 < array[temp]) {
        maxTemp = temp;
        temp = maxTemp / 2;
      } else if (find1 > array[temp]) {
        minTemp = temp;
        temp = (maxTemp - minTemp) / 2 + minTemp;
      } else if (find1 == array[temp]) {
        location = temp + 1;
        System.out.println(find1 + "��" + location + "��° �ڸ��� �ֽ��ϴ�.");
        break;
      } 
      if (find1 == array[maxTemp]) {
        location = maxTemp + 1;
        System.out.println(find1 + "��" + location + "��° �ڸ��� �ֽ��ϴ�.");
        break;
      } 
      if (find1 == array[minTemp]) {
        location = minTemp + 1;
        System.out.println(find1 + "��" + location + "��° �ڸ��� �ֽ��ϴ�.");
        break;
      } 
      if (repeatCount == array.length / 2) {
        System.out.println("ã�� ���� �����ϴ�.");
        break;
      } 
      repeatCount++;
    } 
  }
    /* �迭�� ù��° �ε��� �� */
//	  int left = 0;
//	  
//      /* �迭�̶� -1�� */
//      int right = arr.length - 1;
//      int mid;
//
//      while (left <= right) {
//
//          /* �߾Ӱ��� ����Ѵ� */
//          mid = (left + right) / 2;
//
//          if (key == arr[mid]) {
//              System.out.println(key + "���� Array Index ��ġ : " + mid);
//              break;
//          }
//
//          /* ã���� �ϴ� KEY���� �迭�� �߾Ӱ����� ������� */
//          if (key < arr[mid]) {
//
//              /* �����ʹ� ���ʿ� ��ġ������ right�� mid���� 1�� �� ������ ���� */
//              right = mid - 1;
//          }
//
//          /* ã���� �ϴ� KEY���� �迭�� �߾Ӱ����� Ŭ ��� */
//          else {
//
//              /* �����ʹ� �����ʿ� ��ġ������ left���� mid���� 1�� ���� ������ ���� */
//              left = mid + 1;
//          }
//      }

}
