package softwareRegularMethod.homework1014;

/**
 * message
 * @author Jenny
 *
 */
public enum LoopTesting5_Common {
	  OK("正確")
	, ERR_LENGTH("長度錯誤")
    , ERR_FORMAT ("格式錯誤")
    ;
    private final String content;
    
    LoopTesting5_Common(String content) {
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
}