/**
 * 
 */
package behavior_pattern.mediator_pattern;

/**
 * @author Administrator
 *
 */
public class User {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param name
	 */
	public User(String name) {
		this.name = name;
	}

	public void sendMessage(String message){
		ChatRoom.showMessage(this, message);
	}
}
