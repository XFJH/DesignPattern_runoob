/**
 * 
 */
package structure_pattern.facade_pattern;

/**
 * @author Administrator
 *
 */
public class Rectangle implements Shape {

	/* 
	 * @see structure_pattern.facade_pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}

}
