/**
 * 
 */
package behavior_pattern.memento_pattern;

/**
 * @author Administrator
 *
 */
public class MementoPatternDemo {

	/**
	 * @Description:备忘录模式
	 * 备份对象的一些状态，以备恢复使用
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-22上午11:09:36
	 */
	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		originator.setState("State #1");
	    originator.setState("State #2");
	    careTaker.add(originator.saveStateToMemento());
	    originator.setState("State #3");
	    careTaker.add(originator.saveStateToMemento());
	    originator.setState("State #4");
	    System.out.println("Current State: " + originator.getState());		
	      originator.getStateFromMemento(careTaker.get(0));
	      System.out.println("First saved State: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      System.out.println("Second saved State: " + originator.getState());
	}

}
