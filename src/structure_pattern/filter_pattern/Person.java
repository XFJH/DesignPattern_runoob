/**
 * 
 */
package structure_pattern.filter_pattern;

/**
 * @author Administrator
 *
 */
public class Person {
	private String name;
	private String gender;
	private String maritalStatus;
	
	public Person() {
		
	}
	/**
	 * @param name
	 * @param gender
	 * @param maritalStatus
	 */
	public Person(String name, String gender, String maritalStatus) {
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
}
