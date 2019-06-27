/**
 * 
 */
package behavior_pattern.visitor_pattern;

/**
 * @author Administrator
 *
 */
public class Monitor implements ComputerPart {

	/* 
	 * @see behavior_pattern.visitor_pattern.ComputerPart#accept(behavior_pattern.visitor_pattern.ComputerPartVisitor)
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
