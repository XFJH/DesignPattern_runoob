/**
 * 
 */
package structure_pattern.decorator_pattern;

/**
 * @author Administrator
 *
 */
public class DecoratorPatternDemo {

	/**
	 * @Description:装饰模式
	 * 重在增强功能
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-19下午3:00:07
	 */
	public static void main(String[] args) {
		Shape circle = new Circle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		circle.draw();
		redCircle.draw();
		redRectangle.draw();
	}

}
