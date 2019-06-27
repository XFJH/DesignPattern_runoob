/**
 * 
 */
package behavior_pattern.interpreter_pattern;

/**
 * @author Administrator
 *
 */
public class TerminalExpression implements Expression {
	private String data;
	
	/**
	 * @param data
	 */
	public TerminalExpression(String data) {
		this.data = data;
	}

	/* 
	 * @see behavior_pattern.interpreter_pattern.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String context) {
		if(context.contains(data)){
			return true;
		}
		return false;
	}

}
