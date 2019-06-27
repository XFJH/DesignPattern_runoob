/**
 * 
 */
package behavior_pattern.mediator_pattern;

import java.util.Date;

/**
 * @author Administrator
 *
 */
public class ChatRoom {
	public static void showMessage(User user,String message){
		System.out.println("user name is:"+user.getName()+" message is:"+message + " "+new Date().toString());
	}
}
