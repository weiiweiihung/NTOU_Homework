package softwareRegularMethod.homework1014;

/**
 * check phone number
 * @author Jenny
 *	
 */
public class LoopTesting5_phone {
	public String checkPhone(String[] strArrPhoneNumber){
		if (strArrPhoneNumber == null || (strArrPhoneNumber.length == 1 && "".equals(strArrPhoneNumber[0])))
			return LoopTesting5_Common.ERR_NULL.getContent();
		if (strArrPhoneNumber.length != 10) 
			return LoopTesting5_Common.ERR_LENGTH.getContent();
		if (!"0".equals(strArrPhoneNumber[0]) && !"9".equals(strArrPhoneNumber[1])) {
			return LoopTesting5_Common.ERR_FORMAT.getContent();
		}
				
		for(String str:strArrPhoneNumber){
			if (" ".equals(str))
				return LoopTesting5_Common.ERR_EMPTY.getContent();
			else if(!str.matches("^[0-9]*$"))
				return LoopTesting5_Common.ERR_FORMAT.getContent();
		}
		
		return LoopTesting5_Common.OK.getContent();
	}
}