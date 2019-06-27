/**
 * 
 */
package structure_pattern.bridge_pattern;

/**
 * @author Administrator
 *
 */
public class BridgePatternDemo {

	/**
	 * @Description:桥接模式
	 * 重在抽象和实现化相解耦
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-18下午3:41:57
	 */
	public static void main(String[] args) {
		Shape red= new Circle(1,1,1,new RedCircle());
		Shape green= new Circle(2,2,2,new GreenCircle());
		red.draw();
		green.draw();
		
	}

}
