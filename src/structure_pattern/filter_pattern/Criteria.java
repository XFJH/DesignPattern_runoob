/**
 * 
 */
package structure_pattern.filter_pattern;

import java.util.List;

/**
 * @author Administrator
 *
 */
public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}	
