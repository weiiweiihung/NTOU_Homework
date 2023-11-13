package softwareRegularMethod.homework1118;

/**
 * message
 * @author Jenny
 *
 */
public enum HW4_LoopTesting_Common {
	OK("輸入正確"),
	ERR_NUMBER("包含非數字格式"),
	ERR_FORMAT("格式錯誤");
	
    private final String content;
    
    HW4_LoopTesting_Common(String content) {
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
}
