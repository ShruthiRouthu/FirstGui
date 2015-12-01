
package firstgui;

/**
 *
 * @author Shruthi Routhu
 */
public class MessageService {
    
    private String msgPrefix = "Hello " ;
   
    public final String createMessage(final String suffix){
        return msgPrefix + suffix ;
    }

    public final String getMsgPrefix() {
        return msgPrefix;
    }

    public final void setMsgPrefix(final String msgPrefix) {
        this.msgPrefix = msgPrefix;
    } 
    
}
