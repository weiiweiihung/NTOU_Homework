package softwareRegularMethod.homework1014;

import java.util.ArrayList;

/**
 * check phone number
 * @author Jenny
 *	
 */
public class LoopTesting5_phone {
	public static String checkPhone(ArrayList<String> strList){
		for(String str:strList){
			if(str.length()!=10)
				return LoopTesting5_Common.ERR_LENGTH.getContent();
			else if(!str.matches("^[0-9]*$"))
				return LoopTesting5_Common.ERR_FORMAT.getContent();
			else 
				return LoopTesting5_Common.OK.getContent();
		}
		return "";
	}
}