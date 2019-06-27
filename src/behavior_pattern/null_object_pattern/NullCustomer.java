/**
 * 
 */
package behavior_pattern.null_object_pattern;

/**
 * @author Administrator
 *
 */
public class NullCustomer extends AbstractCustomer {
	@Override
	public boolean isNil() {
		return true;
	}

	/* 
	 * @see behavior_pattern.null_object_pattern.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
