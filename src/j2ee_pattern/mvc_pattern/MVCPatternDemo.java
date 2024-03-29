/**
 * 
 */
package j2ee_pattern.mvc_pattern;

/**
 * @author Administrator
 *
 */
public class MVCPatternDemo {

	/**
	 * @Description:MVC模式
	 * 重在程序分层
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-29下午2:47:12
	 */
	public static void main(String[] args) {
		  //从数据可获取学生记录
	      Student model  = retriveStudentFromDatabase();
	      //创建一个视图：把学生详细信息输出到控制台
	      StudentView view = new StudentView();
	      StudentController controller = new StudentController(model, view);
	      controller.updateView();
	    //更新模型数据
	      controller.setStudentName("John");
	      controller.updateView();
	}
	private static Student retriveStudentFromDatabase(){
	      Student student = new Student();
	      student.setName("Robert");
	      student.setRollNo("10");
	      return student;
	   }
}
