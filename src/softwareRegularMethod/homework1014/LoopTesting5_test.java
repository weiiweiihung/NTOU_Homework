package softwareRegularMethod.homework1014;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class LoopTesting5_test {
	String message = "";
	
	@Test
	public void test1() {
		ArrayList<String>strList = new ArrayList<>();
		String msg = new LoopTesting5_phone().checkPhone(strList);
		System.out.println(msg);
		assertEquals(LoopTesting5_Common.ERR_NULL_OR_EMPTY.getContent(), msg);
	}
	@Test
	public void test2() {
		
		ArrayList<String>strList = new ArrayList<>();
		strList.add("1123");
		String msg = new LoopTesting5_phone().checkPhone(strList);
		System.out.println(msg);
		assertEquals(LoopTesting5_Common.ERR_LENGTH.getContent(), msg);
	}
	@Test
	public void test3() {
		ArrayList<String>strList = new ArrayList<>();
		strList.add("@@!!@@!!@@");
		String msg = new LoopTesting5_phone().checkPhone(strList);
		System.out.println(msg);
		assertEquals(LoopTesting5_Common.ERR_FORMAT.getContent(), msg);
	}
	@Test
	public void test4() {
		ArrayList<String>strList = new ArrayList<>();
		strList.add("0912345678");
		String msg = new LoopTesting5_phone().checkPhone(strList);
		System.out.println(msg);
		assertEquals(LoopTesting5_Common.OK.getContent(), msg);
	}
	@Test
	public void test5() {
		
		ArrayList<String>strList = new ArrayList<>();
		strList.add(null);
		String msg = new LoopTesting5_phone().checkPhone(strList);
		System.out.println(msg);
		assertEquals(LoopTesting5_Common.ERR_NULL_OR_EMPTY.getContent(), msg);
	}
}