/**
 * 
 */
package create_pattern.prototype_pattern;

import java.util.Hashtable;

/**
 * @author Administrator
 *
 */
public class ShapeCache {
	private static Hashtable<String,Shape> shapeMap = new Hashtable<String,Shape>();
	public static Shape getShape(String shapeId){
		Shape shape = shapeMap.get(shapeId);
		return (Shape)shape.clone();
	}
	public static void loadCache(){
		Retangle r = new Retangle();
		r.setId("1");
		shapeMap.put(r.getId(), r);
		
		Square s = new Square();
		s.setId("2");
		shapeMap.put(s.getId(), s);
	}
}
