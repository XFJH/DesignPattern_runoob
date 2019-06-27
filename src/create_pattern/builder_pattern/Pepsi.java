/**
 * 
 */
package create_pattern.builder_pattern;

/**
 * @author Administrator
 *
 */
public class Pepsi extends ColdDrink {

	/* 
	 * @see create_pattern.builder_pattern.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "pepsi";
	}

	/* 
	 * @see create_pattern.builder_pattern.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 35.0f;
	}

}
