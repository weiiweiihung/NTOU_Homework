package softwareRegularMethod.homework1209;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import softwareRegularMethod.homework1118.HW4_LoopTesting_Common;

public class HW7_LoopTesting_test {
	/*
	 * 第7次作業
	 * 正確一次，各種錯誤各一次
	 */
	@Test
	public void testMethod1ForP() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "09123";//長度錯誤or第一、二碼不為09，(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)True
		String msg = new HW7_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
		
}
