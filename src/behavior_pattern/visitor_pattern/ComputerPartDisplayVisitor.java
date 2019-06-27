/**
 * 
 */
package behavior_pattern.visitor_pattern;

/**
 * @author Administrator
 *
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	/* 
	 * @see behavior_pattern.visitor_pattern.ComputerPartVisitor#visit(behavior_pattern.visitor_pattern.Keyboard)
	 */
	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("displaying keyboard");
	}

	/* 
	 * @see behavior_pattern.visitor_pattern.ComputerPartVisitor#visit(behavior_pattern.visitor_pattern.Monitor)
	 */
	@Override
	public void visit(Monitor monitor) {
		System.out.println("displaying monitor");
	}

	/* 
	 * @see behavior_pattern.visitor_pattern.ComputerPartVisitor#visit(behavior_pattern.visitor_pattern.Mouse)
	 */
	@Override
	public void visit(Mouse mouse) {
		System.out.println("displaying mouse");
	}

	/* 
	 * @see behavior_pattern.visitor_pattern.ComputerPartVisitor#visit(behavior_pattern.visitor_pattern.Computer)
	 */
	@Override
	public void visit(Computer computer) {
		System.out.println("displaying computer");
	}

}
