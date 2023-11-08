package softwareRegularMethod.homework1111;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HW3_LoopTesting_test {
	String message = "";
	@Test(timeout = 1000) //1秒內執行幾次
	public void testMethod1() {
	    // 在這裡執行測試程式碼
	    int count = 0;
	    long startTime = System.currentTimeMillis();
	    while (System.currentTimeMillis() - startTime <= 1000) {
	        // 測試程式碼
	    	String strPhoneNumber = "0912345678"; //正確範例
			String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
			String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
			assertEquals(HW3_LoopTesting_Common.OK.getContent(), msg);
	        count++;
	    }
	    System.out.println("執行了 " + count + " 次");
	}
}
