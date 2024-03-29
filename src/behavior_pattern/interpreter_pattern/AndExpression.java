/**
 * 
 */
package behavior_pattern.interpreter_pattern;

/**
 * @author Administrator
 *
 */
public class AndExpression implements Expression {
	private Expression expr1 =null;
	private Expression expr2 =null;
	
	/**
	 * @param expr1
	 * @param expr2
	 */
	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	/* 
	 * @see behavior_pattern.interpreter_pattern.Expression#interpret(java.lang.String)
	 */
	@Override
	public boolean interpret(String context) {
		return expr1.interpret(context) && expr2.interpret(context);
	}

}
