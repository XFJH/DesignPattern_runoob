/**
 * 
 */
package j2ee_pattern.intercepting_filter_pattern;

/**
 * 拦截过滤器模式
 * 在实际目标执行前 做些前后处理
 * @author Administrator
 *
 */
public class InterceptingFilterDemo {
	public static void main(String[] args) {
		  FilterManager filterManager = new FilterManager(new Target());
	      filterManager.setFilter(new AuthenticationFilter());
	      filterManager.setFilter(new DebugFilter());
	      
	      Client client = new Client();
	      client.setFilterManager(filterManager);
	      client.sendRequest("HOME");
	}
}
