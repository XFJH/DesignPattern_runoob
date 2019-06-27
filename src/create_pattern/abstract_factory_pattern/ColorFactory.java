/**
 * 
 */
package create_pattern.abstract_factory_pattern;

/**
 * @author Administrator
 *
 */
public class ColorFactory extends AbstractFactory{
	public Shape getShape(String shapeType){
		return null;
	}

	/* 
	 * @see create_pattern.abstract_factory_pattern.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	Color getColor(String color) {
		if(color  == null){
			return null;
		}
		if(color.equalsIgnoreCase("red")){
			return new Red();
		}else if(color.equalsIgnoreCase("green")){
			return new Green();
		}
		return null;
	}
}
