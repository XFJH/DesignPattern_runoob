/**
 * 
 */
package structure_pattern.decorator_pattern;

/**
 * @author Administrator
 *
 */
public class Circle implements Shape {

	/* 
	 * @see structure_pattern.decorator_pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("it is Circle");
	}

}
