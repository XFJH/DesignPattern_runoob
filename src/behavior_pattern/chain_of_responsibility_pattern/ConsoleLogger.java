/**
 * 
 */
package behavior_pattern.chain_of_responsibility_pattern;

/**
 * @author Administrator
 *
 */
public class ConsoleLogger extends AbstractLogger {
	
	/**
	 * 
	 */
	public ConsoleLogger(int level) {
		this.level = level;
	}

	/* 
	 * @see behavior_pattern.chain_of_responsibility_pattern.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("Console is :"+message);
	}

}
