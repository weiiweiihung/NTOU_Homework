package softwareRegularMethod.homework1125;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestingScoreTest {
	@Test
	public void test1() {
		String result = new TestingScore().getAvgScore(new int[] { -5, -10, -15 }, "期中考");
		assertEquals("分數不得小於0", result);
		System.out.println("test1 response: " + result);
	}
	
	@Test
	public void test2() {
		String result = new TestingScore().getAvgScore(new int[] { 105, 110 }, "期末考");
		assertEquals("分數不得大於100", result);
		System.out.println("test2 response: " + result);
	}
	
	@Test
	public void test3() {
		String result = new TestingScore().getAvgScore(new int[] { 90, 100 }, "期中考");
		assertEquals("28.5", result);
		System.out.println("test3 response: " + result);
	}
	
	@Test
	public void test4() {
		String result = new TestingScore().getAvgScore(new int[] { 60, 90, 75 }, "期末考");
		assertEquals("52.5", result);
		System.out.println("test4 response: " + result);
	}
	
	@Test
	public void test5() {
		String result = new TestingScore().getAvgScore(new int[] { -5, -10, -15 }, "期末考");
		assertEquals("分數不得小於0", result);
		System.out.println("test5 response: " + result);
	}

	@Test
	public void test6() {
		String result = new TestingScore().getAvgScore(new int[] { 105, 110 }, "期中考");
		assertEquals("分數不得大於100", result);
		System.out.println("test6 response: " + result);
	}
	
	@Test
	public void test7() {
		String result = new TestingScore().getAvgScore(new int[] { 105, 90, 80 }, "期中考");
		assertEquals("分數不得大於100", result);
		System.out.println("test7 response: " + result);
	}

}
