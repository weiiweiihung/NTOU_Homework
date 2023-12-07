package softwareRegularMethod.homework1209_HW2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HW8_TestingScoreTest {
	@Test
	public void test1() {
		String result = new HW8_TestingScore().getAvgScore(new int[] { 60, 80 });
		assertEquals("合格", result);
		System.out.println("test1 response: " + result);
	}

	//邊界值 59,60,61
	@Test
	public void test2() {
		String result = new HW8_TestingScore().getAvgScore(new int[] { 59, 80 });
		assertEquals("不合格", result);
		System.out.println("test1 response: " + result);
	}

	@Test
	public void test3() {
		String result = new HW8_TestingScore().getAvgScore(new int[] { 61, 80 });
		assertEquals("合格", result);
		System.out.println("test1 response: " + result);
	}

	//邊界值 79,80,81
	@Test
	public void test4() {
		String result = new HW8_TestingScore().getAvgScore(new int[] { 60, 79 });
		assertEquals("不合格", result);
		System.out.println("test1 response: " + result);
	}

	@Test
	public void test5() {
		String result = new HW8_TestingScore().getAvgScore(new int[] { 60, 81 });
		assertEquals("合格", result);
		System.out.println("test1 response: " + result);
	}
	
}
