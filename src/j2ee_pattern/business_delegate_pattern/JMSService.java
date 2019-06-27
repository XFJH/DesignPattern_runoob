/**
 * 
 */
package j2ee_pattern.business_delegate_pattern;

/**
 * @author Administrator
 *
 */
public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("JMSService doProcessing");
	}

}
