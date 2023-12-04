package softwareRegularMethod.homework1209;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import softwareRegularMethod.homework1118.HW4_LoopTesting_Common;

public class HW7_LoopTesting_test {
	/*
	 * 第7次作業
	 * 正確一次，各種錯誤各一次(四種錯誤)
  	 * 總共五次
	 */
	@Test
	public void testMethod1ForP() {
		String strPhoneNumber = "0912345678";//正確
		String msg = new HW7_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.OK.getContent(), msg);   
	}

	@Test
	public void testMethod2ForP() {
		String strPhoneNumber = "123456";//長度非為10
		String msg = new HW7_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}

	@Test
	public void testMethod3ForP() {
		String strPhoneNumber = "9912345678";//第一碼不是0
		String msg = new HW7_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}

	@Test
	public void testMethod4ForP() {
		String strPhoneNumber = "0012345678";//第二碼不是9
		String msg = new HW7_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}

	@Test
	public void testMethod5ForP() {
		String strPhoneNumber = "09%$#45678";//包含非數字字元
		String msg = new HW7_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_NUMBER.getContent(), msg);   
	}
	
		
}
