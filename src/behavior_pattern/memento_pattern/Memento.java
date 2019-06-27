/**
 * 
 */
package behavior_pattern.memento_pattern;

/**
 * @author Administrator
 *
 */
public class Memento {
	private String state;

	/**
	 * @param state
	 */
	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
}
