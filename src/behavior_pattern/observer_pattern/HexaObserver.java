/**
 * 
 */
package behavior_pattern.observer_pattern;

/**
 * @author Administrator
 *
 */
public class HexaObserver extends Observer {
	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/* 
	 * @see behavior_pattern.observer_pattern.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("HexaObserver:"+Integer.toHexString(subject.getState()).toUpperCase());
	}

}
