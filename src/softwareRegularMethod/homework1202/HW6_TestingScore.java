package softwareRegularMethod.homework1202;

public class HW6_TestingScore {
	public String getAvgScore(int[] scoreArr, String exam) {
		int total = 0;
		for (int score : scoreArr) {
			if (score > 100) {
				return "分數不得大於100";
			} else if (score <= 0) {//應為<0
				return "分數不得小於0";
			}
			total += score;
		}

		double weighted;
		if ("期中考".equals(exam)) {
			weighted = 0.3;
		} else {
			weighted = 0.7;
		}
		return Double.toString((double) total / scoreArr.length * weighted);
	}
}
