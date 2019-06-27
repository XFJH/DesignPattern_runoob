/**
 * 
 */
package j2ee_pattern.mvc_pattern;

/**
 * @author Administrator
 *
 */
public class StudentView {
	public void printStudentDetails(String studentName, String studentRollNo){
	      System.out.println("Student: ");
	      System.out.println("Name: " + studentName);
	      System.out.println("Roll No: " + studentRollNo);
	   }
}
