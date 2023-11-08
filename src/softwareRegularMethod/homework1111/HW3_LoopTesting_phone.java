package softwareRegularMethod.homework1111;
																		    
/**                                                                         
 * check phone number                                                       
 * @author Jenny                                                            
 *	                                                                        
 */                                                                         
public class HW3_LoopTesting_phone {                                           
	public String checkPhone(String[] strArrPhoneNumber){					 
		if (strArrPhoneNumber == null)                                  // 1
			return HW3_LoopTesting_Common.ERR_NULL.getContent();			// 2
		if (strArrPhoneNumber.length != 10) 							// 3
			return HW3_LoopTesting_Common.ERR_LENGTH.getContent();			// 4
		int index = 0;		                                            // 5 
		for(String str:strArrPhoneNumber){                              // 6 
			if(index==0)                                                // 7 
				if(!str.matches("[0]")) 								// 8 
					return HW3_LoopTesting_Common.ERR_FORMAT.getContent();	// 9
			if(index==1)                                                // 10
				if(!str.matches("[9]")) 								// 11
					return HW3_LoopTesting_Common.ERR_FORMAT.getContent();	// 12
			if(index>=2)                                              	// 13
				if(!str.matches("^[0-9]*$")) 							// 14
					return HW3_LoopTesting_Common.ERR_FORMAT.getContent();	// 15			                                                            
			index++;                                                    // 16
		}                                                                  
		return HW3_LoopTesting_Common.OK.getContent();						// 17
	}                                                                    
}                                                                           