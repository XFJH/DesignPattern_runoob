/**
 * 
 */
package behavior_pattern.visitor_pattern;

/**
 * @author Administrator
 *
 */
public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
