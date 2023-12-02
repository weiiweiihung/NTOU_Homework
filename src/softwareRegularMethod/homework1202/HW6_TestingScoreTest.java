package softwareRegularMethod.homework1202;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HW6_TestingScoreTest {
	@Test
	public void test1() {//不合法成績(負數),期中考
		String result = new HW6_TestingScore().getAvgScore(new int[] { -5, -10, -15 }, "期中考");
		assertEquals("分數不得小於0", result);
		System.out.println("HW6_test1 response: " + result);
	}
	@Test
	public void test2() {//不合法成績(負數),期末考
		String result = new HW6_TestingScore().getAvgScore(new int[] { -5, -10, -15 }, "期末考");
		assertEquals("分數不得小於0", result);
		System.out.println("HW6_test2 response: " + result);
	}
	
	@Test
	public void test3() {//不合法成績(超過100),期中考
		String result = new HW6_TestingScore().getAvgScore(new int[] { 105, 110, 120 }, "期中考");
		assertEquals("分數不得大於100", result);
		System.out.println("HW6_test3 response: " + result);
	}
	@Test
	public void test4() {//不合法成績(超過100),期末考
		String result = new HW6_TestingScore().getAvgScore(new int[] { 105, 110, 120 }, "期末考");
		assertEquals("分數不得大於100", result);
		System.out.println("HW6_test4 response: " + result);
	}
	
	@Test
	public void test5() {//加權,期中考
		String result = new HW6_TestingScore().getAvgScore(new int[] { 90, 100, 80 }, "期中考");
		assertEquals("27.0", result);
		System.out.println("HW6_test5 response: " + result);
	}	
	@Test
	public void test6() {//加權,期末考
		String result = new HW6_TestingScore().getAvgScore(new int[] { 60, 90, 75 }, "期末考");
		assertEquals("52.5", result);
		System.out.println("HW6_test6 response: " + result);
	}
	
	@Test
	public void test7() {//變異測試
		String result = new HW6_TestingScore().getAvgScore(new int[] { 0, 0, 0 }, "期末考");
		assertEquals("0", result);
		System.out.println("HW6_test7 response: " + result);
	}
	@Test
	public void test8() {//變異測試
		String result = new HW6_TestingScore().getAvgScore(new int[] { 60, 70, 80 }, "期末考");
		assertEquals("49.0", result);
		System.out.println("HW6_test7 response: " + result);
	}
}
