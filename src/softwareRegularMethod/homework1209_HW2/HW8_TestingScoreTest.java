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

	//邊界值 50,60,70
	@Test
	public void test2() {
		String result = new HW8_TestingScore().getAvgScore(new int[] { 50, 80 });
		assertEquals("不合格", result);
		System.out.println("test1 response: " + result);
	}

	@Test
	public void test3() {
		String result = new HW8_TestingScore().getAvgScore(new int[] { 70, 80 });
		assertEquals("合格", result);
		System.out.println("test1 response: " + result);
	}

	//邊界值 70,80,90
	@Test
	public void test4() {
		String result = new HW8_TestingScore().getAvgScore(new int[] { 60, 70 });
		assertEquals("不合格", result);
		System.out.println("test1 response: " + result);
	}

	@Test
	public void test5() {
		String result = new HW8_TestingScore().getAvgScore(new int[] { 60, 90 });
		assertEquals("合格", result);
		System.out.println("test1 response: " + result);
	}
	
}
