package softwareRegularMethod.homework1014;

import java.util.ArrayList;
import org.junit.Test;

/**
 * 兩次單元測試
 * @author jenny
 *
 */
public class LoopTesting2 {

	private void checkFunction(ArrayList<String> strList) {
		for(String str:strList)
			if(str.equals("0"))
				System.out.println("Y");		
			else 
				System.out.println("N");
	}
	
	@Test
	public void test1() {
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("a");
//		strList.add("0");
		checkFunction(strList);
	}
	@Test
	public void test2() {
		ArrayList<String> strList = new ArrayList<String>();
//		strList.add("a");
		strList.add("0");
		checkFunction(strList);
	}
}