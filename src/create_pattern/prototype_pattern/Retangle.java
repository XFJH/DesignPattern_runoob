/**
 * 
 */
package create_pattern.prototype_pattern;

/**
 * @author Administrator
 *
 */
public class Retangle extends Shape {
	public Retangle(){
		type="retangle";
	}
	/* 
	 * @see create_pattern.prototype_pattern.Shape#draw()
	 */
	@Override
	void draw() {
		System.out.println("retangle");
	}

}
