/**
 * 
 */
package behavior_pattern.null_object_pattern;

/**
 * @author Administrator
 *
 */
public class RealCustomer extends AbstractCustomer {
	public RealCustomer(String name){
		this.name = name;
	}
	@Override
	public boolean isNil() {
		return false;
	}

	/* 
	 * @see behavior_pattern.null_object_pattern.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

}
