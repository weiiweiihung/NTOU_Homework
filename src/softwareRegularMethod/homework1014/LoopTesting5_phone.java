package softwareRegularMethod.homework1014;

import java.util.ArrayList;

/**
 * check phone number
 * @author Jenny
 *	
 */
public class LoopTesting5_phone {
	public String checkPhone(ArrayList<String> strList){
		if (strList == null || strList.size() <= 0)
			return LoopTesting5_Common.ERR_NULL_OR_EMPTY.getContent();
		
		String msg = "";
		
		for(String str:strList){
			if (str == null)
				msg = LoopTesting5_Common.ERR_NULL_OR_EMPTY.getContent();
			else if(str.length() != 10)
				msg = LoopTesting5_Common.ERR_LENGTH.getContent();
			else if(!str.matches("^[0-9]*$"))
				msg = LoopTesting5_Common.ERR_FORMAT.getContent();
			else 
				msg = LoopTesting5_Common.OK.getContent();
		}
		
		return msg;
	}
}