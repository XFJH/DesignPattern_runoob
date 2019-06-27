/**
 * 
 */
package behavior_pattern.observer_pattern;

/**
 * @author Administrator
 *
 */
public class ObserverPatternDemo {

	/**
	 * @Description:观察者模式
	 * 状态变化时会通知依赖的对象
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-22下午2:45:18
	 */
	public static void main(String[] args) {
		Subject subject = new Subject();
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		subject.setState(5);
		subject.setState(10);
	}

}
