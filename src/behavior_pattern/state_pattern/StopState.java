/**
 * 
 */
package behavior_pattern.state_pattern;

/**
 * @author Administrator
 *
 */
public class StopState implements State {

	/* 
	 * @see behavior_pattern.state_pattern.State#doAction(behavior_pattern.state_pattern.Context)
	 */
	@Override
	public void doAction(Context context) {
		context.setState(this);
	}
	public String toString(){
		return "Stop State";
	}
}
