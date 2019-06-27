/**
 * 
 */
package create_pattern.prototype_pattern;

/**
 * @author Administrator
 *
 */
public class Square extends Shape {
	public Square(){
		type="square";
	}
	/* 
	 * @see create_pattern.prototype_pattern.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("square");
	}

}
