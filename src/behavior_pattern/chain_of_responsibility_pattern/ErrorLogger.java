/**
 * 
 */
package behavior_pattern.chain_of_responsibility_pattern;

/**
 * @author Administrator
 *
 */
public class ErrorLogger extends AbstractLogger {
	
	/**
	 * 
	 */
	public ErrorLogger(int level) {
		this.level = level;
	}

	/* 
	 * @see behavior_pattern.chain_of_responsibility_pattern.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("Error is :"+message);
	}

}
