package softwareRegularMethod.homework1014;

import java.util.ArrayList;
import org.junit.Test;

/**
 * @author shen
 *
 */
public class LoopTesting3 {

	private void checkFunction(ArrayList<String> strList) {
		for(String str:strList)
			if(str.equals("0"))
				System.out.println("Y");		
			else 
				System.out.println("N");
	}
	
	@Test
	public void test1() {
		ArrayList<String> strList1 = new ArrayList<String>();
		ArrayList<String> strList2 = new ArrayList<String>();
		strList1.add("a");
		strList2.add("0");
		checkFunction(strList1);
		checkFunction(strList2);
	}

}