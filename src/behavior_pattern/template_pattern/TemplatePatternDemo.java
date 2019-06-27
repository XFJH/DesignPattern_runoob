/**
 * 
 */
package behavior_pattern.template_pattern;

/**
 * @author Administrator
 *
 */
public class TemplatePatternDemo {

	/**
	 * @Description:模板模式
	 * 可以不改变一些算法结构可定义算法的某些特定特定步骤
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-26下午5:22:54
	 */
	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		
		game = new Football();
		game.play();
	}

}
