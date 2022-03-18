package question_a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int plus = 1000000000; int minus = -1000000000;
        int plusN1 = 0; int plusN2 = 0;
        int minus1 = 0; int minus2 = 0;

        for (int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt(); //배열에 값 할당
        }
        for (int i = 0; i < n-1; i++) { // 배열 크기만큼 반복
            for (int j = i+1; j < n; j++) { // i바로 뒤 값과 비교
                int tmp = arr[i] + arr[j]; // 두 값을 더하여 tmp에 저장
                if (tmp > 0 && tmp < plus) { // tmp가 양수고 가장 큰 양수보다 작을경우
                    plus = tmp; // 현재 가장 큰 양수 변경
                    plusN1 = arr[i];  //각 특성 값 저장
                    plusN2 = arr[j];
                }
                else if (tmp < 0 && tmp > minus) { // 음수일경우
                    minus = tmp;
                    minus1 = arr[i]; minus2 = arr[j];
                }
                else if (tmp == 0) { // tmp가 0일경우 즉시 출력후 반복문 종료
                    System.out.printf("%d %d", arr[i], arr[j]);
                    i = n; break;
                }
            }
        }
        if (plus * -1 > minus && minus < 0) //양수를 음수화 하였을 때 기존 음수보다 클 경우
            System.out.printf("%d %d", plusN1, plusN2);
        else if (minus * -1 < plus && plus > 0)
            System.out.printf("%d %d", minus1, minus2);
    }
}

//첫째 줄에는 전체 용액의 수 N이 입력된다. 
//N은 2 이상 100,000 이하이다. 
//둘째 줄에는 용액의 특성값을 나타내는 N개의 정수가 빈칸을 사이에 두고 주어진다. 
//이 수들은 모두 -1,000,000,000 이상 1,000,000,000 이하이다. 
//N개의 용액들의 특성값은 모두 다르고, 산성 용액만으로나 
//알칼리성 용액만으로 입력이 주어지는 경우도 있을 수 있다.
//
//첫째 줄에 특성값이 0에 가장 가까운 용액을 만들어내는 두 용액의 특성값을 출력한다. 
//출력해야하는 두 용액은 특성값의 오름차순으로 출력한다. 특
//성값이 0에 가장 가까운 용액을 만들어내는 경우가 두 개 이상일 경우에는 그 중 아무것이나 하나를 출력한다.
