/**
 * 
 */
package create_pattern.singleton_pattern;

/**
 * @author Administrator
 *
 */
public class SingleObject {
	private static SingleObject instancce = new SingleObject();
	private SingleObject(){}
	public static SingleObject getInstance(){
		return instancce;
	}
	public void showMessage(){
		System.out.println("hello ...");
	}
}
