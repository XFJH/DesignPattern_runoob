/**
 * 
 */
package structure_pattern.facade_pattern;

/**
 * @author Administrator
 *
 */
public class Circle implements Shape {

	/* 
	 * @see structure_pattern.facade_pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}

}
