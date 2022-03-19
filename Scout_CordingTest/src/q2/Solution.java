package q2;

public class Solution {
	
	public static void main(String[] args) {
		String[] scores = {"AAFAFA", "FEECAA", "FABBCB", "CBEDEE", "CCCCCC"};
		System.out.println(solution(scores));
	}
	public static int solution(String[] scores) {
		int answer = 0;
		
		for (int i = 0; i < scores.length; i++) {

			int[] scoreTmp = new int[7];
			for (int j = 0; j < scores[0].length(); j++) {
				char tmp = scores[i].charAt(j);
				switch (tmp) {
				case 'A':++scoreTmp[5];break;
				case 'B':++scoreTmp[4];break;
				case 'C':++scoreTmp[3];break;
				case 'D':++scoreTmp[2];break;
				case 'E':++scoreTmp[1];break;
				case 'F':++scoreTmp[0];break;
				default:break;
				}
				if (scoreTmp[0] == 2) {
					j = scores[0].length();
				}
			}
			if (scoreTmp[0] == 2 && scoreTmp[5] >= 2) {
				answer++;

			} else {
				boolean high = false;
				boolean low = false;
				
				for (int j = 0; j < scoreTmp.length-1; j++) {
					if (high == false && scoreTmp[scoreTmp.length - j - 1] != 0) {
						--scoreTmp[scoreTmp.length - j - 1];
						high = true;
					}
					if (low == false && scoreTmp[j] != 0) {
						--scoreTmp[j];
						low = true;
					}
					scoreTmp[6] += j * scoreTmp[j];
				}
				double avr = scoreTmp[6] / (scores[0].length()-2);
				if (avr >= 3) {
					answer++;
				}
			}
		}
		
		return answer;
	}
}
