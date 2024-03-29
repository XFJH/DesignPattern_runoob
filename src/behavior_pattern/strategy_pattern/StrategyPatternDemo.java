/**
 * 
 */
package behavior_pattern.strategy_pattern;

/**
 * 策略模式
 * 行为随着策略的改变而改变
 * @author Administrator
 *
 */
public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 ="+context.executeStrategy(10, 5));
		
		 context = new Context(new OperationSubstract());		
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
	      
	      context = new Context(new OperationMultiply());		
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
