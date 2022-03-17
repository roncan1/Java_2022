package q1;

public class Main {
//	최대값 / 최소값
  public static void main(String[] args) {
    int[] array = { 10, 55, 23, 2, 79, 101, 16, 82, 30, 45 };
    int max = array[0];
    int maxCount = 0;
    int min = array[0];
    int minCount = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
        maxCount = i + 1;
      } 
      if (array[i] < min) {
        min = array[i];
        minCount = i + 1;
      } 
    } 
    System.out.println("최대값 : " + max);
    System.out.println("위치 : " + maxCount);
    System.out.println("최소값 : " + min);
    System.out.println("위치 : " + minCount);
  }
}
