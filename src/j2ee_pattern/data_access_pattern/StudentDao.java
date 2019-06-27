/**
 * 
 */
package j2ee_pattern.data_access_pattern;

import java.util.List;

/**
 * @author Administrator
 *
 */
public interface StudentDao {
	  public List<Student> getAllStudents();
	   public Student getStudent(int rollNo);
	   public void updateStudent(Student student);
	   public void deleteStudent(Student student);
}
