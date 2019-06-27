/**
 * 
 */
package j2ee_pattern.intercepting_filter_pattern;

/**
 * @author Administrator
 *
 */
public class FilterManager {
	   FilterChain filterChain;
	   public FilterManager(Target target){
		      filterChain = new FilterChain();
		      filterChain.setTarget(target);
		   }
	   public void setFilter(Filter filter){
		      filterChain.addFilter(filter);
		   }
	   public void filterRequest(String request){
		      filterChain.execute(request);
		   }
}
