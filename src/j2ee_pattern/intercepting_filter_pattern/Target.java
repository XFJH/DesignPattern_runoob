/**
 * 
 */
package j2ee_pattern.intercepting_filter_pattern;

/**
 * @author Administrator
 *
 */
public class Target {
	 public void execute(String request){
	      System.out.println("Executing request: " + request);
	   }
}
