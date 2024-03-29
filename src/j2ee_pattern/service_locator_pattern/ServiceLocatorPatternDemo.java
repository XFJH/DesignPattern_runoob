/**
 * 
 */
package j2ee_pattern.service_locator_pattern;

/**
 * 服务定位器模式
 * 利用了缓存存放服务，一定提高了性能
 * @author Administrator
 *
 */
public class ServiceLocatorPatternDemo {
	public static void main(String[] args) {
		 Service service = ServiceLocator.getService("Service1");
	      service.execute();
	      service = ServiceLocator.getService("Service2");
	      service.execute();
	      service = ServiceLocator.getService("Service1");
	      service.execute();
	      service = ServiceLocator.getService("Service2");
	      service.execute();		
	}
}
