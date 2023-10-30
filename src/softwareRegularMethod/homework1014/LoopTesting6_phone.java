package softwareRegularMethod.homework1014;
																		    
/**                                                                         
 * check phone number                                                       
 * @author Jenny                                                            
 *	                                                                        
 */                                                                         
public class LoopTesting6_phone {                                           
	public String checkPhone(String[] strArrPhoneNumber){				// 1	 
		if (strArrPhoneNumber == null)                                  // 2
			return LoopTesting6_Common.ERR_NULL.getContent();			// 3
		if (strArrPhoneNumber.length != 10) 							// 4 
			return LoopTesting6_Common.ERR_LENGTH.getContent();			// 5
		int index = 0;		                                            // 6  
		for(String str:strArrPhoneNumber){                              // 7
			if(index==0)                                                // 8  
				if(!str.matches("[0]")) 								// 9
					return LoopTesting6_Common.ERR_FORMAT.getContent();	// 10
			if(index==1)                                                // 11
				if(!str.matches("[9]")) 								// 12
					return LoopTesting6_Common.ERR_FORMAT.getContent();	// 13
			if(index>=2) {                                              // 14
				if(!str.matches("^[0-9]*$")) 							// 15
					return LoopTesting6_Common.ERR_FORMAT.getContent();	// 16
			}                                                            
			index++;                                                    // 17
		}                                                               
		return LoopTesting6_Common.OK.getContent();						// 18
	}                                                                       
}                                                                           