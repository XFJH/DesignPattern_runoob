/**
 * 
 */
package behavior_pattern.chain_of_responsibility_pattern;

/**
 * @author Administrator
 *
 */
public class FileLogger extends AbstractLogger {
	
	/**
	 * 
	 */
	public FileLogger(int level) {
		this.level = level;
	}

	/* 
	 * @see behavior_pattern.chain_of_responsibility_pattern.AbstractLogger#write(java.lang.String)
	 */
	@Override
	protected void write(String message) {
		System.out.println("File is :"+message);
	}

}
