package softwareRegularMethod.homework1014;

/**
 * check phone number
 * @author Jenny
 *	
 */
public class LoopTesting5_phone {
	public String checkPhone(String[] strArrPhoneNumber){							        //1
		if (strArrPhoneNumber == null || (strArrPhoneNumber.length == 1 && "".equals(strArrPhoneNumber[0])))    //2
			return LoopTesting5_Common.ERR_NULL.getContent();						//3
		if (strArrPhoneNumber.length != 10) 									//4
			return LoopTesting5_Common.ERR_LENGTH.getContent();						//5
		if (!"0".equals(strArrPhoneNumber[0]) && !"9".equals(strArrPhoneNumber[1])) {				//6
			return LoopTesting5_Common.ERR_FORMAT.getContent();						//7
		}
				
		for(String str:strArrPhoneNumber){									//8
			if (" ".equals(str))										//9
				return LoopTesting5_Common.ERR_EMPTY.getContent();					//10
			else if(!str.matches("^[0-9]*$"))								//11
				return LoopTesting5_Common.ERR_FORMAT.getContent();					//12
		}
		
		return LoopTesting5_Common.OK.getContent();								//13
	}
}
