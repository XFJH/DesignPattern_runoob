/**
 * 
 */
package structure_pattern.facade_pattern;

/**
 * @author Administrator
 *
 */
public class FacadePatternDemo {

	/**
	 * @Description:外观模式
	 * 重在影藏复杂性
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-19下午3:25:16
	 */
	public static void main(String[] args) {
		ShapeMaker sm = new ShapeMaker();
		sm.drawCircle();
		sm.drawRectangle();
		sm.drawSquare();
	}

}
