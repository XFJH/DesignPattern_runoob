/**
 * 
 */
package behavior_pattern.null_object_pattern;

/**
 * @author Administrator
 *
 */
public class CustomerFactory {
	public static final String[] names={"rob","joe","julie"};
	public static AbstractCustomer getCustomer(String name){
		for(int i =0;i<names.length;i++){
			if(names[i].equalsIgnoreCase(name)){
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
