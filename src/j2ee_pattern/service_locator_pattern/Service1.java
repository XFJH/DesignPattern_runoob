/**
 * 
 */
package j2ee_pattern.service_locator_pattern;

/**
 * @author Administrator
 *
 */
public class Service1 implements Service {

	/* 
	 * @see j2ee_pattern.service_locator_pattern.Service#getName()
	 */
	@Override
	public String getName() {
	    return "Service1";
	}

	/* 
	 * @see j2ee_pattern.service_locator_pattern.Service#execute()
	 */
	@Override
	public void execute() {
	    System.out.println("Executing Service1");
	}

}
