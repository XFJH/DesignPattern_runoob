/**
 * 
 */
package behavior_pattern.visitor_pattern;

/**
 * @author Administrator
 *
 */
public class VisitorPatternDemo {

	/**
	 * @Description:访问者模式
	 * 结构和数据分离或解耦
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-27上午9:29:46
	 */
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
