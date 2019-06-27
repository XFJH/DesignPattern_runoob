/**
 * 
 */
package behavior_pattern.mediator_pattern;

/**
 * @author Administrator
 *
 */
public class MediatorPatternDemo {

	/**
	 * @Description:
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-22上午10:15:13
	 */
	public static void main(String[] args) {
		User user1 = new User("robert");
		User user2 = new User("john");
		
		user1.sendMessage("hi,john");
		user2.sendMessage("hi,i am john");
		user1.sendMessage("how are you");
		
	}

}
