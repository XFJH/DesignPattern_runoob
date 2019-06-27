/**
 * 
 */
package structure_pattern.decorator_pattern;

/**
 * @author Administrator
 *
 */
public abstract class ShapeDecorator implements Shape {
	protected Shape decoratedShape;
	/**
	 * @param decoratedShape
	 */
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
