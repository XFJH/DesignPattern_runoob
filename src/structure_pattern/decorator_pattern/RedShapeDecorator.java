/**
 * 
 */
package structure_pattern.decorator_pattern;

/**
 * @author Administrator
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

	/**
	 * @param decoratedShape
	 */
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);//装饰信息
	}
	private void setRedBorder(Shape decoratedShape){
	      System.out.println("Border Color: Red");
	}
	
}
