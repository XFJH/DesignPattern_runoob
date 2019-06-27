/**
 * 
 */
package behavior_pattern.interpreter_pattern;

/**
 * 解释器模式
 * 解释文法
 * @author Administrator
 *
 */
public class InterpreterPatternDemo {
	public static Expression getMaleExpression(){
		Expression e1 = new TerminalExpression("robert");
		Expression e2 = new TerminalExpression("john");
		return new OrExpression(e1, e2);
	}
	public static Expression getMarriedWomanExpression(){
		Expression e1 = new TerminalExpression("julie");
		Expression e2 = new TerminalExpression("married");
		return new AndExpression(e1, e2);
	}
	/**
	 * @Description:
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-21下午4:42:18
	 */
	public static void main(String[] args) {
		 Expression isMale = getMaleExpression();
	     Expression isMarriedWoman = getMarriedWomanExpression();
	     System.out.println("john is male?"+isMale.interpret("john"));
	     System.out.println("julie is a women?"+isMarriedWoman.interpret("married julie"));
	}

}
