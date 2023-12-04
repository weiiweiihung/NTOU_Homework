package softwareRegularMethod.homework1209;

import softwareRegularMethod.homework1118.HW4_LoopTesting_Common;

/**                                                                         
 * check phone number                                                       
 * @author Jenny                                                            
 *	                                                                        
 */                                                                         
public class HW7_LoopTesting_phone {                                           
	public String checkPhone(String strPhoneNumber){	
	     if (strPhoneNumber.length() != 10) { 
	        return HW4_LoopTesting_Common.ERR_FORMAT.getContent(); //長度非為10
	     } 
	     if (strPhoneNumber.charAt(0) != '0'){
	    	return HW4_LoopTesting_Common.ERR_FORMAT.getContent(); //第一碼不是0
	     }
	     if (strPhoneNumber.charAt(1) != '9'){
		    	return HW4_LoopTesting_Common.ERR_FORMAT.getContent(); //第二碼不是9
		 }
	     
	     for (char c : strPhoneNumber.toCharArray()) {//迴圈取得每個字元
	        if (!Character.isDigit(c)) {//判斷每個字元是否"不為"數字0-9
	           return HW4_LoopTesting_Common.ERR_NUMBER.getContent(); //非數字0-9則回錯誤訊息
	        }
	     }
	     
	     return HW4_LoopTesting_Common.OK.getContent();//判斷都正確則回輸入正確                                                               
	}                                                                    
}                                                                           