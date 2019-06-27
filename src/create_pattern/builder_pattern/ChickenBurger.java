/**
 * 
 */
package create_pattern.builder_pattern;

/**
 * @author Administrator
 *
 */
public class ChickenBurger extends Burger {

	/* 
	 * @see create_pattern.builder_pattern.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "chicken burger";
	}

	/* 
	 * @see create_pattern.builder_pattern.Burger#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 50.0f;
	}

}
