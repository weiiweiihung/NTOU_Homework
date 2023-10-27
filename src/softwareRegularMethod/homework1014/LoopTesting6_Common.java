package softwareRegularMethod.homework1014;

/**
 * message
 * @author Jenny
 *
 */
public enum LoopTesting5_Common {
	OK("輸入正確"),
	ERR_LENGTH("長度錯誤"),
	ERR_FORMAT("格式錯誤"),
	ERR_EMPTY("輸入的號碼有空格"),
	ERR_NULL("輸入的資料為空");
	
    private final String content;
    
    LoopTesting5_Common(String content) {
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
}