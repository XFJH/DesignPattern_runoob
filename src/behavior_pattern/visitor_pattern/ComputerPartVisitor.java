/**
 * 
 */
package behavior_pattern.visitor_pattern;

/**
 * @author Administrator
 *
 */
public interface ComputerPartVisitor {
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
	public void visit(Mouse mouse);
	public void visit(Computer computer);
}
