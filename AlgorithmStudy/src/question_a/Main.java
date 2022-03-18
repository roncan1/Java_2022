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
            arr[i] = sc.nextInt(); //�迭�� �� �Ҵ�
        }
        for (int i = 0; i < n-1; i++) { // �迭 ũ�⸸ŭ �ݺ�
            for (int j = i+1; j < n; j++) { // i�ٷ� �� ���� ��
                int tmp = arr[i] + arr[j]; // �� ���� ���Ͽ� tmp�� ����
                if (tmp > 0 && tmp < plus) { // tmp�� ����� ���� ū ������� �������
                    plus = tmp; // ���� ���� ū ��� ����
                    plusN1 = arr[i];  //�� Ư�� �� ����
                    plusN2 = arr[j];
                }
                else if (tmp < 0 && tmp > minus) { // �����ϰ��
                    minus = tmp;
                    minus1 = arr[i]; minus2 = arr[j];
                }
                else if (tmp == 0) { // tmp�� 0�ϰ�� ��� ����� �ݺ��� ����
                    System.out.printf("%d %d", arr[i], arr[j]);
                    i = n; break;
                }
            }
        }
        if (plus * -1 > minus && minus < 0) //����� ����ȭ �Ͽ��� �� ���� �������� Ŭ ���
            System.out.printf("%d %d", plusN1, plusN2);
        else if (minus * -1 < plus && plus > 0)
            System.out.printf("%d %d", minus1, minus2);
    }
}

//ù° �ٿ��� ��ü ����� �� N�� �Էµȴ�. 
//N�� 2 �̻� 100,000 �����̴�. 
//��° �ٿ��� ����� Ư������ ��Ÿ���� N���� ������ ��ĭ�� ���̿� �ΰ� �־�����. 
//�� ������ ��� -1,000,000,000 �̻� 1,000,000,000 �����̴�. 
//N���� ��׵��� Ư������ ��� �ٸ���, �꼺 ��׸����γ� 
//��Į���� ��׸����� �Է��� �־����� ��쵵 ���� �� �ִ�.
//
//ù° �ٿ� Ư������ 0�� ���� ����� ����� ������ �� ����� Ư������ ����Ѵ�. 
//����ؾ��ϴ� �� ����� Ư������ ������������ ����Ѵ�. Ư
//������ 0�� ���� ����� ����� ������ ��찡 �� �� �̻��� ��쿡�� �� �� �ƹ����̳� �ϳ��� ����Ѵ�.
