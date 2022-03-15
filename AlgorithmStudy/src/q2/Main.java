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
        System.out.println(find1 + "은" + location + "번째 자리에 있습니다.");
        break;
      } 
      if (find1 == array[maxTemp]) {
        location = maxTemp + 1;
        System.out.println(find1 + "은" + location + "번째 자리에 있습니다.");
        break;
      } 
      if (find1 == array[minTemp]) {
        location = minTemp + 1;
        System.out.println(find1 + "은" + location + "번째 자리에 있습니다.");
        break;
      } 
      if (repeatCount == array.length / 2) {
        System.out.println("찾는 값이 없습니다.");
        break;
      } 
      repeatCount++;
    } 
  }
    /* 배열의 첫번째 인덱스 값 */
//	  int left = 0;
//	  
//      /* 배열이라서 -1함 */
//      int right = arr.length - 1;
//      int mid;
//
//      while (left <= right) {
//
//          /* 중앙값을 계산한다 */
//          mid = (left + right) / 2;
//
//          if (key == arr[mid]) {
//              System.out.println(key + "값의 Array Index 위치 : " + mid);
//              break;
//          }
//
//          /* 찾고자 하는 KEY값이 배열의 중앙값보다 작을경우 */
//          if (key < arr[mid]) {
//
//              /* 데이터는 왼쪽에 위치함으로 right를 mid에서 1을 뺀 값으로 변경 */
//              right = mid - 1;
//          }
//
//          /* 찾고자 하는 KEY값이 배열의 중앙값보다 클 경우 */
//          else {
//
//              /* 데이터는 오른쪽에 위치함으로 left값을 mid에서 1을 더한 값으로 변경 */
//              left = mid + 1;
//          }
//      }

}
