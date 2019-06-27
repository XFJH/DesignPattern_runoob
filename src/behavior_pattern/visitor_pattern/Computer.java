/**
 * 
 */
package behavior_pattern.visitor_pattern;

/**
 * @author Administrator
 *
 */
public class Computer implements ComputerPart {
	ComputerPart[] parts;
	
	/**
	 * @param parts
	 */
	public Computer() {
		this.parts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for(int i = 0;i<parts.length;i++){
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
}
