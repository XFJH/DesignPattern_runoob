/**
 * 
 */
package create_pattern.builder_pattern;

/**
 * @author Administrator
 *
 */
public class VegBurger extends Burger {

	/* 
	 * @see create_pattern.builder_pattern.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "veg burger";
	}

	/* 
	 * @see create_pattern.builder_pattern.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

}
