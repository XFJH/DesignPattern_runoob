/**
 * 
 */
package structure_pattern.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 *
 */
public class ShapeFactory {
	private static final Map<String,Shape> circleMap = new HashMap<String,Shape>(); 
	public static Shape getCircle(String color){
		Circle circle = (Circle)circleMap.get(color);
		if(circle == null){
			circle =  new Circle(color);
			circleMap.put(color, circle);
			System.out.println("new circle of color is:"+color);
		}
		return circle;
	}
}
