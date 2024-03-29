/**
 * 
 */
package behavior_pattern.observer_pattern;

/**
 * @author Administrator
 *
 */
public class BinaryObserver extends Observer {
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/* 
	 * @see behavior_pattern.observer_pattern.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("BinaryObserver:"+Integer.toBinaryString(subject.getState()));
	}

}
