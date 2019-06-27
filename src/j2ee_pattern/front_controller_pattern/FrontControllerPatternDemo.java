/**
 * 
 */
package j2ee_pattern.front_controller_pattern;

/**
 * 	前端控制模式
 * 类似struts的请求分发机制
 * @author Administrator
 *
 */
public class FrontControllerPatternDemo {
	public static void main(String[] args) {
	     FrontController frontController = new FrontController();
	     frontController.dispatchRequest("HOME");
	     frontController.dispatchRequest("STUDENT");
	}
}
