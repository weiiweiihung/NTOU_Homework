package softwareRegularMethod.homework1111;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class HW3_LoopTesting_test {
	String message = "";
	@Test
	public void testMethod1() {
	    // 在這裡執行測試程式碼
	    // 最小值
		String strPhoneNumber = "0900000000";
		String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
		String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
		assertEquals(HW3_LoopTesting_Common.OK.getContent(), msg);   
	}
	
	@Test
	public void testMethod2() {
	    // 在這裡執行測試程式碼
		// 最大值
		String strPhoneNumber = "0999999999";
		String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
		String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
		assertEquals(HW3_LoopTesting_Common.OK.getContent(), msg);  
	}
	
	@Test
	public void testMethod3() {
		// 在這裡執行測試程式碼
		// 有效範圍內的長度
    	String strPhoneNumber = "0912345678";
		String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
		String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
		
		assertEquals(HW3_LoopTesting_Common.OK.getContent(), msg);
	}
	
	@Test
	public void testMethod4() {
		// 在這裡執行測試程式碼
		// 有效範圍"外"的長度-1(長度為9)
		String strPhoneNumber = "091234567";
		String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
		String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
				
		assertEquals(HW3_LoopTesting_Common.ERR_LENGTH.getContent(), msg);
	}

	@Test
	public void testMethod5() {
		// 在這裡執行測試程式碼
		// 有效範圍"外"的長度+1(長度為11)
		String strPhoneNumber = "091234567";
		String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
		String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
						
		assertEquals(HW3_LoopTesting_Common.ERR_LENGTH.getContent(), msg);
	}
	
	@Test
	public void testMethod6() {
		// 在這裡執行測試程式碼
		// 無效值(非數字)
		String strPhoneNumber = "09124$%%^*";
		String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
		String msg = new HW3_LoopTesting_phone().checkPhone(strArrPhoneNumber);
								
		assertEquals(HW3_LoopTesting_Common.ERR_FORMAT.getContent(), msg);
	}
}
