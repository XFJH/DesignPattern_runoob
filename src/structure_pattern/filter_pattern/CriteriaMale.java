/**
 * 
 */
package structure_pattern.filter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class CriteriaMale implements Criteria {

	/* 
	 * @see structure_pattern.filter_pattern.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> maleList = new ArrayList<Person>();
		for(Person person:persons){
			if(person.getGender().equalsIgnoreCase("male")){
				maleList.add(person);
			}
		}
		return maleList;
	}

}
