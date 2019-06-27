/**
 * 
 */
package j2ee_pattern.intercepting_filter_pattern;

/**
 * @author Administrator
 *
 */
public class AuthenticationFilter implements Filter {

	@Override
	public void execute(String request) {
			      System.out.println("Authenticating request: " + request);
	}

}
