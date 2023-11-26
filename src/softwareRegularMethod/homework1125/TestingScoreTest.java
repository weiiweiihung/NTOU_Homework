package softwareRegularMethod.homework1125;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestingScoreTest {
	@Test
	public void test1() {//不合法成績(負數),期中考
		String result = new TestingScore().getAvgScore(new int[] { -5, -10, -15 }, "期中考");
		assertEquals("分數不得小於0", result);
		System.out.println("test1 response: " + result);
	}
	@Test
	public void test2() {//不合法成績(負數),期末考
		String result = new TestingScore().getAvgScore(new int[] { -5, -10, -15 }, "期末考");
		assertEquals("分數不得小於0", result);
		System.out.println("test2 response: " + result);
	}
	
	@Test
	public void test3() {//不合法成績(超過100),期中考
		String result = new TestingScore().getAvgScore(new int[] { 105, 110, 120 }, "期中考");
		assertEquals("分數不得大於100", result);
		System.out.println("test3 response: " + result);
	}
	@Test
	public void test4() {//不合法成績(超過100),期末考
		String result = new TestingScore().getAvgScore(new int[] { 105, 110, 120 }, "期末考");
		assertEquals("分數不得大於100", result);
		System.out.println("test4 response: " + result);
	}
	
	@Test
	public void test5() {//加權,期中考
		String result = new TestingScore().getAvgScore(new int[] { 90, 100, 80 }, "期中考");
		assertEquals("27.0", result);
		System.out.println("test5 response: " + result);
	}	
	@Test
	public void test6() {//加權,期末考
		String result = new TestingScore().getAvgScore(new int[] { 60, 90, 75 }, "期末考");
		assertEquals("52.5", result);
		System.out.println("test6 response: " + result);
	}
}
