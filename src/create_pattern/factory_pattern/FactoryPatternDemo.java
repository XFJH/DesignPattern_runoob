/**
 * 
 */
package create_pattern.factory_pattern;

/**
 * 工厂模式
 * @author Administrator
 *
 */
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		Shape circle = sf.getShape("circle");
		circle.draw();
		Shape square = sf.getShape("square");
		square.draw();
	}
}
