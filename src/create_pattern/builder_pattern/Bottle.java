/**
 * 
 */
package create_pattern.builder_pattern;

/**
 * @author Administrator
 *
 */
public class Bottle implements Packing {

	/* 
	 * @see create_pattern.builder_pattern.Packing#pack()
	 */
	@Override
	public String pack() {
		return "bottle";
	}

}
