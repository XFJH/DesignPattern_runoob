/**
 * 
 */
package create_pattern.builder_pattern;

/**
 * @author Administrator
 *
 */
public abstract class Burger implements Item {
	/* 
	 * @see create_pattern.builder_pattern.Item#packing()
	 */
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

	/* 
	 * @see create_pattern.builder_pattern.Item#price()
	 */
	@Override
	public abstract float price();

}
