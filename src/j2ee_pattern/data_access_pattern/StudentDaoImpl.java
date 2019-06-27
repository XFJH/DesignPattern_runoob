/**
 * 
 */
package j2ee_pattern.data_access_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class StudentDaoImpl implements StudentDao{
	  //列表是当作一个数据库
	   List<Student> students;
	   
	   public StudentDaoImpl(){
		      students = new ArrayList<Student>();
		      Student student1 = new Student("Robert",0);
		      Student student2 = new Student("John",1);
		      students.add(student1);
		      students.add(student2);		
		   }
	/* 
	 * @see j2ee_pattern.data_access_pattern.StudentDao#getAllStudents()
	 */
	@Override
	public List<Student> getAllStudents() {
		 return students;
	}

	/* 
	 * @see j2ee_pattern.data_access_pattern.StudentDao#getStudent(int)
	 */
	@Override
	public Student getStudent(int rollNo) {
		 return students.get(rollNo);
	}

	/* 
	 * @see j2ee_pattern.data_access_pattern.StudentDao#updateStudent(j2ee_pattern.data_access_pattern.Student)
	 */
	@Override
	public void updateStudent(Student student) {
		  students.get(student.getRollNo()).setName(student.getName());
	      System.out.println("Student: Roll No " + student.getRollNo() 
	         +", updated in the database");
	}

	/* 
	 * @see j2ee_pattern.data_access_pattern.StudentDao#deleteStudent(j2ee_pattern.data_access_pattern.Student)
	 */
	@Override
	public void deleteStudent(Student student) {
		   students.remove(student.getRollNo());
		      System.out.println("Student: Roll No " + student.getRollNo() 
		         +", deleted from database");
	}

}
