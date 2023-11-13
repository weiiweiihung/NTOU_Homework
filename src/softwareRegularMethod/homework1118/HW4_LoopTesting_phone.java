package softwareRegularMethod.homework1118;
																		    
/**                                                                         
 * check phone number                                                       
 * @author Jenny                                                            
 *	                                                                        
 */                                                                         
public class HW4_LoopTesting_phone {                                           
	public String checkPhone(String strPhoneNumber){	
	     if (strPhoneNumber.length() != 10 || !(strPhoneNumber.charAt(0) == '0' && strPhoneNumber.charAt(1) == '9')) { 
	        return HW4_LoopTesting_Common.ERR_FORMAT.getContent(); //長度非為10或第一、二碼不是09開頭則回錯誤訊息
	     } else {
	        for (char c : strPhoneNumber.toCharArray()) {//迴圈取得每個字元
	            if (!Character.isDigit(c)) {//判斷每個字元是否"不為"數字0-9
	            	return HW4_LoopTesting_Common.ERR_NUMBER.getContent(); //非數字0-9則回錯誤訊息
	            }
	        }
	     }
	     return HW4_LoopTesting_Common.OK.getContent();//判斷都正確則回輸入正確                                                               
	}                                                                    
}                                                                           