/**
 * 
 */
package create_pattern.abstract_factory_pattern;

/**
 * @author Administrator
 *
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String factory){
		if(factory  == null){
			return null;
		}
		if(factory.equalsIgnoreCase("color")){
			return new ColorFactory();
		}else if(factory.equalsIgnoreCase("shape")){
			return new ShapeFactory();
		}
		return null;
	}
}
