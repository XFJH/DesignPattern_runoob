/**
 * 
 */
package structure_pattern.composite_pattern;

/**
 * @author Administrator
 *
 */
public class CompositePatternDemo {

	/**
	 * @Description:组合模式
	 * 部分整体 都被当做是单一对象来处理
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-19下午2:08:18
	 */
	public static void main(String[] args) {
		Employee CEO = new Employee("John","CEO", 30000);
		
		 Employee headSales = new Employee("Robert","Head Sales", 20000);
	      Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
	      Employee salesExecutive2 = new Employee("Rob","Sales", 10000);
	      
		 Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
		  Employee clerk1 = new Employee("Laura","Marketing", 10000);
		  Employee clerk2 = new Employee("Bob","Marketing", 10000);
		  
		  CEO.add(headSales);
		  CEO.add(headMarketing);
		  
		  headSales.add(salesExecutive1);
	      headSales.add(salesExecutive2);
	      
	      headMarketing.add(clerk1);
	      headMarketing.add(clerk2);
	      
	      //打印该组织的所有员工,如果层级增加的话还得加一层遍历
	      System.out.println(CEO); 
	      for (Employee headEmployee : CEO.getSubordinates()) {
	         System.out.println(headEmployee);
	         for (Employee employee : headEmployee.getSubordinates()) {
	            System.out.println(employee);
	         }
	      }	
	}

}
