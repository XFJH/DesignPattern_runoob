/**
 * 
 */
package structure_pattern.flyweight_pattern;

import structure_pattern.proxy_pattern.Image;
import structure_pattern.proxy_pattern.ProxyImage;

/**
 * @author Administrator
 *
 */
public class ProxyPatternDemo {

	/**
	 * @Description:
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-20下午2:51:49
	 */
	public static void main(String[] args) {
		Image image= new ProxyImage("xxx.jpg");
		//加载图像
		image.display();
		//直接使用
		image.display();
	}

}
