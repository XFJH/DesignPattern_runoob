/**
 * 
 */
package create_pattern.factory_pattern;

/**
 * @author Administrator
 *
 */
public class ShapeFactory {
	public Shape getShape(String shapeType){
		if(shapeType  == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("circle")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("square")){
			return new Square();
		}
		return null;
	}
}
