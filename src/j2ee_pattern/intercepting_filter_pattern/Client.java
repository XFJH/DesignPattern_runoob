/**
 * 
 */
package j2ee_pattern.intercepting_filter_pattern;

/**
 * @author Administrator
 *
 */
public class Client {
	 FilterManager filterManager;
	 public void setFilterManager(FilterManager filterManager){
	      this.filterManager = filterManager;
	   }
	  public void sendRequest(String request){
	      filterManager.filterRequest(request);
	   }
}
