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
	
}
