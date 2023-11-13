package softwareRegularMethod.homework1118;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class HW4_LoopTesting_test {
	/*
	 * Predicate Coverage
	 */
	@Test
	public void testMethod1ForP() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "09123";//長度錯誤or第一、二碼不為09，(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)True
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
	@Test
	public void testMethod2ForP() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "09123$%^&*";//長度正確&第一、二碼不為09，但判斷是否皆為數字"錯誤" (False True)
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_NUMBER.getContent(), msg);   
	}
	
	@Test
	public void testMethod3ForP() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "0912345678";//長度正確&第一、二碼為09，且判斷是否皆為數字"正確" (False False)
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.OK.getContent(), msg);   
	}
	
	/*
	 * Clause Coverage
	 */
	@Test
	public void testMethod1ForCl() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "09123";//長度錯誤但第一、二碼為09，(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)True False
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
	@Test
	public void testMethod2ForCl() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "1234567890";//長度正確但第一、二碼不是09，(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)False True
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
	@Test
	public void testMethod3ForCl() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "123";//長度不正確且第一、二碼不是09，(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)True True
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
	@Test
	public void testMethod4ForCl() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "091^@$5678";//長度正確&第一、二碼是09開頭，判斷非皆為數字"true" False False True
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_NUMBER.getContent(), msg);   
	}
	
	@Test
	public void testMethod5ForCl() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "0912345678";//長度正確&第一、二碼是09開頭，判斷非皆為數字"false" False False False
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.OK.getContent(), msg);   
	}
	
	/*
	 * Combinatorial Coverage
	 */
	@Test
	public void testMethod1ForCo() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "09123";//長度錯誤但第一、二碼為09(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
	@Test
	public void testMethod2ForCo() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "123";//長度錯誤且第一、二碼不是09(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
	@Test
	public void testMethod3ForCo() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "0123";//長度錯誤且第一碼是0但第二碼不是9(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
	@Test
	public void testMethod4ForCo() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "193";//長度錯誤且第一碼不是0但第二碼是9(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
	@Test
	public void testMethod5ForCo() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "1912345678";//長度正確但第一碼不是0而第二碼為9(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
	@Test
	public void testMethod6ForCo() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "0123456789";//長度正確但第一碼是0而第二碼不是9(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
	@Test
	public void testMethod7ForCo() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "1212345678";//長度正確但第一、第二碼不是09(判斷是否皆為數字邏輯上走不到，因為前面就會直接RETURN)
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_FORMAT.getContent(), msg);   
	}
	
	@Test
	public void testMethod8ForCo() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "091%%#5678";//長度正確&第一、二碼是09開頭，判斷是否皆為數字"錯誤"
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.ERR_NUMBER.getContent(), msg);   
	}
	
	@Test
	public void testMethod9ForCo() {
	    // 在這裡執行測試程式碼
		String strPhoneNumber = "0912345678";//長度正確&第一、二碼是09開頭，判斷是否皆為數字"正確"
		String msg = new HW4_LoopTesting_phone().checkPhone(strPhoneNumber);
		assertEquals(HW4_LoopTesting_Common.OK.getContent(), msg);   
	}
	
	
	
}
