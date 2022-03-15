package q3_1;

public class Main {
	public static void main(String[] args) {
		
//		버블정렬 *1번에 사이클에 마지막 한자리는 무조건 고정
		// i = 사이클 수, j = 비교하는 첫번째 수
	
		int[] arr = new int[] { 80, 50, 70, 10, 60, 20, 40, 30 };
		for(int i = 0; i < arr.length; i++) {
	        for(int j = 0 ; j < arr.length - i - 1 ; j++) {
	            if(arr[j] > arr[j+1]) {
	                int temp = arr[j+1];
	                arr[j+1] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }

		
		for (int k = 0; k < arr.length; k++) {
		      System.out.println(arr[k]); 
		  }
	}


}
