package softwareRegularMethod.homework1111;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import softwareRegularMethod.homework1014.LoopTesting6_Common;
import softwareRegularMethod.homework1014.LoopTesting6_phone;

public class LoopTesting6_test {
	String message = "";
	
	@Test
	public void test1() {
		String [] strArrPhoneNumber = null;
		String msg = new LoopTesting6_phone().checkPhone(strArrPhoneNumber);
		System.out.println(msg);
		assertEquals(LoopTesting6_Common.ERR_NULL.getContent(), msg);
	}
	@Test
	public void test2() {
		String strPhoneNumber = "1123";
		String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
		String msg = new LoopTesting6_phone().checkPhone(strArrPhoneNumber);
		System.out.println(msg);
		assertEquals(LoopTesting6_Common.ERR_LENGTH.getContent(), msg);
	}
	@Test
	public void test3() {// 第1碼不為0
		String strPhoneNumber = "1234567890";
		strPhoneNumber = strPhoneNumber.trim();
		String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
		String msg = new LoopTesting6_phone().checkPhone(strArrPhoneNumber);
		System.out.println(msg);
		assertEquals(LoopTesting6_Common.ERR_FORMAT.getContent(), msg);
	}
	@Test
	public void test4() {// 第2碼不為9
		String strPhoneNumber = "0112345678";
		String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
		String msg = new LoopTesting6_phone().checkPhone(strArrPhoneNumber);
		System.out.println(msg);
		assertEquals(LoopTesting6_Common.ERR_FORMAT.getContent(), msg);
	}
	@Test
	public void test5() {
		String strPhoneNumber = "09@@123456";
		String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
		String msg = new LoopTesting6_phone().checkPhone(strArrPhoneNumber);
		System.out.println(msg);
		assertEquals(LoopTesting6_Common.ERR_FORMAT.getContent(), msg);
	}
	@Test
	public void test6() {//OK
		String strPhoneNumber = "0912345678";
		String [] strArrPhoneNumber = strPhoneNumber.split("(?!^)");//轉array
		String msg = new LoopTesting6_phone().checkPhone(strArrPhoneNumber);
		System.out.println(msg);
		assertEquals(LoopTesting6_Common.OK.getContent(), msg);
	}
}
