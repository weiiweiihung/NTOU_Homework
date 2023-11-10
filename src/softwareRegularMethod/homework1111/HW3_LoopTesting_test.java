package softwareRegularMethod.homework1111;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class HW3_LoopTesting_test {
	String message = "";
	@Test(timeout = 1000) //超過1秒還未回復執行成功則表示失敗
	public void testMethod1() {
	    // 在這裡執行測試程式碼
	    int count = 0;
	    long startTime = System.currentTimeMillis();
	    while (System.currentTimeMillis() - startTime <= 1000) { //1秒內執行幾次
	        // 測試程式碼
	    	String [] strArrPhoneNumber = null;
			String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
			
			assertEquals(HW3_LoopTesting_Common.ERR_NULL.getContent(), msg);
	        count++;
	    }
	    System.out.println("執行了 " + count + " 次");
	}
	
	@Test(timeout = 1000) //超過1秒還未回復執行成功則表示失敗
	public void testMethod2() {
	    // 在這裡執行測試程式碼
	    int count = 0;
	    long startTime = System.currentTimeMillis();
	    while (System.currentTimeMillis() - startTime <= 1000) { //1秒內執行幾次
	        // 測試程式碼
	    	String strPhoneNumber = "1123";
			String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
			String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
			
			assertEquals(HW3_LoopTesting_Common.ERR_LENGTH.getContent(), msg);
	        count++;
	    }
	    System.out.println("執行了 " + count + " 次");
	}
	
	@Test(timeout = 1000) //超過1秒還未回復執行成功則表示失敗
	public void testMethod3() {
	    // 在這裡執行測試程式碼
	    int count = 0;
	    long startTime = System.currentTimeMillis();
	    while (System.currentTimeMillis() - startTime <= 1000) { //1秒內執行幾次
	        // 測試程式碼
	    	String strPhoneNumber = "1234567890";
			strPhoneNumber = strPhoneNumber.trim();
			String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
			String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
			
			assertEquals(HW3_LoopTesting_Common.ERR_FORMAT.getContent(), msg);
	        count++;
	    }
	    System.out.println("執行了 " + count + " 次");
	}
	
	@Test(timeout = 1000) //超過1秒還未回復執行成功則表示失敗
	public void testMethod4() {
	    // 在這裡執行測試程式碼
	    int count = 0;
	    long startTime = System.currentTimeMillis();
	    while (System.currentTimeMillis() - startTime <= 1000) { //1秒內執行幾次
	        // 測試程式碼
	    	String strPhoneNumber = "0112345678";// 第2碼不為9
			String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
			String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
			
			assertEquals(HW3_LoopTesting_Common.ERR_FORMAT.getContent(), msg);
	        count++;
	    }
	    System.out.println("執行了 " + count + " 次");
	}

	@Test(timeout = 1000) //超過1秒還未回復執行成功則表示失敗
	public void testMethod5() {
	    // 在這裡執行測試程式碼
	    int count = 0;
	    long startTime = System.currentTimeMillis();
	    while (System.currentTimeMillis() - startTime <= 1000) { //1秒內執行幾次
	        // 測試程式碼
	    	String strPhoneNumber = "09@@123456";
			String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
			String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
			
			assertEquals(HW3_LoopTesting_Common.ERR_FORMAT.getContent(), msg);
	        count++;
	    }
	    System.out.println("執行了 " + count + " 次");
	}
	
	@Test(timeout = 1000) //超過1秒還未回復執行成功則表示失敗
	public void testMethod6() {
	    // 在這裡執行測試程式碼
	    int count = 0;
	    long startTime = System.currentTimeMillis();
	    while (System.currentTimeMillis() - startTime <= 1000) { //1秒內執行幾次
	        // 測試程式碼
	    	String strPhoneNumber = "0912345678";
			String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
			String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
			
			assertEquals(HW3_LoopTesting_Common.OK.getContent(), msg);
	        count++;
	    }
	    System.out.println("執行了 " + count + " 次");
	}
}
