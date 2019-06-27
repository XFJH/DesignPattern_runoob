/**
 * 
 */
package create_pattern.abstract_factory_pattern;

/**
 * 抽象工厂模式
 * @author Administrator
 *
 */
public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory shapeaf = FactoryProducer.getFactory("shape");
		Shape circle = shapeaf.getShape("circle");
		circle.draw();
		Shape square = shapeaf.getShape("square");
		square.draw();
		
		AbstractFactory coloraf = FactoryProducer.getFactory("color");
		Color red = coloraf.getColor("red");
		red.fill();
		Color green = coloraf.getColor("green");
		green.fill();
	}
}
