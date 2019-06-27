/**
 * 
 */
package create_pattern.builder_pattern;

/**
 * @author Administrator
 *
 */
public class Coke extends ColdDrink {

	/* 
	 * @see create_pattern.builder_pattern.Item#name()
	 */
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "coke";
	}

	/* 
	 * @see create_pattern.builder_pattern.ColdDrink#price()
	 */
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 30.0f;
	}

}
