package q1;

public class Main {
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
    System.out.println(": " + max);
    System.out.println(": " + maxCount);
    System.out.println(": " + min);
    System.out.println(": " + minCount);
  }
}
