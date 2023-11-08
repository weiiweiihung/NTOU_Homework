package softwareRegularMethod.homework1111;

/**
 * message
 * @author Jenny
 *
 */
public enum HW3_LoopTesting_Common {
	OK("輸入正確"),
	ERR_LENGTH("長度錯誤"),
	ERR_FORMAT("格式錯誤"),
	ERR_NULL("輸入的資料為空");
	
    private final String content;
    
    HW3_LoopTesting_Common(String content) {
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
}
