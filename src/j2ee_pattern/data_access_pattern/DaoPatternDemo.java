/**
 * 
 */
package j2ee_pattern.data_access_pattern;

/**
 * DAO模式
 * 把底层数据操作从高层业务中分离出来
 * @author Administrator
 *
 */
public class DaoPatternDemo {
	public static void main(String[] args) {
		 StudentDao studentDao = new StudentDaoImpl();

	      //输出所有的学生
	      for (Student student : studentDao.getAllStudents()) {
	         System.out.println("Student: [RollNo : "
	            +student.getRollNo()+", Name : "+student.getName()+" ]");
	      }
	      

	      //更新学生
	      Student student =studentDao.getAllStudents().get(0);
	      student.setName("Michael");
	      studentDao.updateStudent(student);
	      

	      //获取学生
	      studentDao.getStudent(0);
	      System.out.println("Student: [RollNo : "
	         +student.getRollNo()+", Name : "+student.getName()+" ]");		

	}
}
