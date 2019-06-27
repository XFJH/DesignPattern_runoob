/**
 * 
 */
package structure_pattern.filter_pattern;

import java.util.List;

/**
 * @author Administrator
 *
 */
public class OrCriteria implements Criteria {
	 private Criteria criteria;
	   private Criteria otherCriteria;
	   
	/**
	 * @param criteria
	 * @param otherCriteria
	 */
	public OrCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/* 
	 * @see structure_pattern.filter_pattern.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		 List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
	      List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

	      for (Person person : otherCriteriaItems) {
	         if(!firstCriteriaItems.contains(person)){
		        firstCriteriaItems.add(person);
	         }
	      }	
	      return firstCriteriaItems;
	}

}
