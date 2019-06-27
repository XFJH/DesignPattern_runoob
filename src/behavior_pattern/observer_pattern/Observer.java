/**
 * 
 */
package behavior_pattern.observer_pattern;

/**
 * @author Administrator
 *
 */
public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
