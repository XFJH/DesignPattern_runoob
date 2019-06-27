/**
 * 
 */
package structure_pattern.filter_pattern;

import java.util.List;

/**
 * @author Administrator
 *
 */
public class AndCriteria implements Criteria {
	private Criteria criteria;
	   private Criteria otherCriteria;
	   
	/**
	 * @param criteria
	 * @param otherCriteria
	 */
	public AndCriteria(Criteria criteria, Criteria otherCriteria) {
		this.criteria = criteria;
		this.otherCriteria = otherCriteria;
	}

	/* 
	 * @see structure_pattern.filter_pattern.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);		
	      return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
