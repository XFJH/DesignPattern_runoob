/**
 * 
 */
package j2ee_pattern.intercepting_filter_pattern;

/**
 * @author Administrator
 *
 */
public class DebugFilter implements Filter {

	@Override
	public void execute(String request) {
		  System.out.println("request log: " + request);
	}

}
