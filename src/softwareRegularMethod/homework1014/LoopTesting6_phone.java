package softwareRegularMethod.homework1014;

/**
 * check phone number
 * @author Jenny
 *	
 */
public class LoopTesting6_phone {
	public String checkPhone(String[] strArrPhoneNumber){							        //1
		if (strArrPhoneNumber == null)    //2
			return LoopTesting6_Common.ERR_NULL.getContent();						//3
		if (strArrPhoneNumber.length != 10) 									//4
			return LoopTesting6_Common.ERR_LENGTH.getContent();						//5
		if (!"0".equals(strArrPhoneNumber[0]) && !"9".equals(strArrPhoneNumber[1])||!"0".equals(strArrPhoneNumber[0])||!"9".equals(strArrPhoneNumber[1])) {//6
			return LoopTesting6_Common.ERR_FORMAT.getContent();						//7
		}
				
		for(String str:strArrPhoneNumber){									//8
			if(!str.matches("^[0-9]*$"))									//9
				return LoopTesting6_Common.ERR_FORMAT.getContent();					//10
		}
		
		return LoopTesting6_Common.OK.getContent();								//11
	}
}
