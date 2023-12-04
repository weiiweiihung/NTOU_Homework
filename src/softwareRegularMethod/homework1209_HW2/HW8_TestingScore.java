package softwareRegularMethod.homework1209_HW2;

public class HW8_TestingScore {
	public String getAvgScore(int[] scoreArr) {
		for (int score : scoreArr) {
			if (score > 100) {
				return "分數不得大於100";
			} else if (score < 0) {
				return "分數不得小於0";
			}
		}
		
		int firstScore = scoreArr[0];
		int secondScore = scoreArr[1];
		
		if ((firstScore+secondScore)/2 < 70) {
			return "不合格";
		}
		return "合格";
	}
}
