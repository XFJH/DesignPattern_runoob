/**
 * 
 */
package j2ee_pattern.transfer_object_pattern;

/**
 * @author Administrator
 *
 */
public class StudentVO {
	 private String name;
	   private int rollNo;
	   StudentVO(String name, int rollNo){
		      this.name = name;
		      this.rollNo = rollNo;
		   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	   
}
