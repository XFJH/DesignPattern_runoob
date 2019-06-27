/**
 * 
 */
package structure_pattern.facade_pattern;

/**
 * @author Administrator
 *
 */
public class Square implements Shape {

	/* 
	 * @see structure_pattern.facade_pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}

}
