/**
 * 
 */
package create_pattern.abstract_factory_pattern;

/**
 * @author Administrator
 *
 */
public class ShapeFactory extends AbstractFactory{
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

	/* 
	 * @see create_pattern.abstract_factory_pattern.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
