package softwareRegularMethod.homework1014;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LoopTesting4Test {

	//@Test
	public void test1() {
		LoopTesting4 test4 = new LoopTesting4();
		for (int i = 0; i <= 10; i++) {
			assertTrue(test4.isPositive(i));
		}
	}
	
	//@Test
	public void test() {
		LoopTesting4 test4 = new LoopTesting4();
		assertFalse(test4.isPositive(-1));
	}
}
