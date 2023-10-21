package softwareRegularMethod.homework1014;

import java.util.ArrayList;

import org.junit.Test;

public class LoopTesting5_test {
	
	@Test
	public void test1() {
		ArrayList<String>strList1 = new ArrayList<>();
		System.out.println("正列為空: "+LoopTesting5_phone.checkPhone(strList1));
	}
	@Test
	public void test2() {
		ArrayList<String>strList = new ArrayList<>();
		strList.add("1123");
		System.out.println("手機號碼: "+LoopTesting5_phone.checkPhone(strList));
	}
	@Test
	public void test3() {
		ArrayList<String>strList = new ArrayList<>();
		strList.add("@@!!@@!!@@");
		System.out.println("手機號碼: "+LoopTesting5_phone.checkPhone(strList));
	}
	@Test
	public void test4() {
		ArrayList<String>strList = new ArrayList<>();
		strList.add("0912345678");
		System.out.println("手機號碼: "+LoopTesting5_phone.checkPhone(strList));
	}
}