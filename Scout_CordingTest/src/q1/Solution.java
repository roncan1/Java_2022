package q1;

class Solution {

	public static void main(String[] args) {
		int[] coinPriceList = { 150, 350, 300, 400, 100, 600 };
		System.out.println(solution(coinPriceList));
	}

	public static int solution(int[] coinPriceList) {
		int answer = 0;
		int checkTriple = 1;
		int i = -1;
		while (i < coinPriceList.length) {
			int tmp1 = 0;
			int tmp2 = 0;

			if (i + 1 == coinPriceList.length - 1 && checkTriple < 3) {
				i += 1;
				answer += coinPriceList[i];
			} else if (i + 2 == coinPriceList.length - 1) {
				if (checkTriple == 1) {
					i += 1;
					checkTriple++;
					answer += coinPriceList[i];
				} else {
					i = coinPriceList.length - 1;
					answer += coinPriceList[i];
				}
			} else if (i == coinPriceList.length - 1) {
				break;
			} else {
				tmp1 = coinPriceList[i + 1];
				tmp2 = coinPriceList[i + 2];
				if (tmp1 < tmp2 || checkTriple == 3) {
					i += 2;
					checkTriple = 0;
					answer += coinPriceList[i];
				} else if (tmp1 > tmp2) {
					i += 1;
					checkTriple++;
					answer += coinPriceList[i];
				} else if (tmp1 == tmp2) {
					i += 1;
					checkTriple++;
					answer += coinPriceList[i];
				}
			}

		}
		return answer;
	}
}
