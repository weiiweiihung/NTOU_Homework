package softwareRegularMethod.homework1014;

/**
 * check phone number
 * @author Jenny
 *	
 */
public class LoopTesting6_phone {
	private String regex_1 = "[0]";	
	private String regex_2 = "[9]";
	public String checkPhone(String[] strArrPhoneNumber){							        					//1
		if (strArrPhoneNumber == null || (strArrPhoneNumber.length == 1 && "".equals(strArrPhoneNumber[0])))    					//2
			return LoopTesting6_Common.ERR_NULL.getContent();											//3
		if (strArrPhoneNumber.length != 10) 														//4
			return LoopTesting6_Common.ERR_LENGTH.getContent();											//5
		if (!strArrPhoneNumber[0].matches(regex_1)) || (strArrPhoneNumber[0].matches(regex_1) && !strArrPhoneNumber[1].matches(regex_2)))) {		//6
			return LoopTesting6_Common.ERR_FORMAT.getContent();											//7
		}
				
		for(String str:strArrPhoneNumber){														//8
			if(!str.matches("^[0-9]*$"))														//9
				return LoopTesting6_Common.ERR_FORMAT.getContent();										//10
		}
		
		return LoopTesting6_Common.OK.getContent();													//11
	}
}
