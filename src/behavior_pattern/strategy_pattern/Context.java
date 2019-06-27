/**
 * 
 */
package behavior_pattern.strategy_pattern;

/**
 * @author Administrator
 *
 */
public class Context {
	private Strategy strategy;

	/**
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	public int executeStrategy(int num1,int num2){
		return strategy.doOperation(num1, num2);
	}
}
