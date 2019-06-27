/**
 * 
 */
package create_pattern.abstract_factory_pattern;

/**
 * @author Administrator
 *
 */
public abstract class AbstractFactory {
	abstract Shape getShape(String shape);
	abstract Color getColor(String color);
	
}
