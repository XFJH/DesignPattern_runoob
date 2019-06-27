/**
 * 
 */
package create_pattern.builder_pattern;

/**
 * @author Administrator
 *
 */
public abstract class ColdDrink implements Item {
	/* 
	 * @see create_pattern.builder_pattern.Item#packing()
	 */
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	/* 
	 * @see create_pattern.builder_pattern.Item#price()
	 */
	@Override
	public abstract float price();

}
