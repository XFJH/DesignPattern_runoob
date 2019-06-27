/**
 * 
 */
package structure_pattern.proxy_pattern;

/**
 * @author Administrator
 *
 */
public class ProxyPatternDemo {

	/**
	 * @Description:代理模式
	 * 重在代替类工作
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-21上午9:57:25
	 */
	public static void main(String[] args) {
		Image image = new ProxyImage("xx.jpg");
		image.display();
		//
		image.display();	
	}

}
