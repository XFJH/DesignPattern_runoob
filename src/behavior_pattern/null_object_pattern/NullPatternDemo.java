/**
 * 
 */
package behavior_pattern.null_object_pattern;

/**
 * 空对象模式
 * Null对象在数据不可用的时候提供默认行为
 * @author Administrator
 *
 */
public class NullPatternDemo {
	public static void main(String[] args) {
		AbstractCustomer customer1 = CustomerFactory.getCustomer("rob");
		AbstractCustomer customer2 = CustomerFactory.getCustomer("bob");
		AbstractCustomer customer3 = CustomerFactory.getCustomer("julie");
		AbstractCustomer customer4 = CustomerFactory.getCustomer("laura");
		
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}

}
