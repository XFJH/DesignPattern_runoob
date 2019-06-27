/**
 * 
 */
package behavior_pattern.observer_pattern;

/**
 * @author Administrator
 *
 */
public class OctalObserver extends Observer {
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	/* 
	 * @see behavior_pattern.observer_pattern.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("OctalObserver:"+Integer.toOctalString(subject.getState()));
	}

}
