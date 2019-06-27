/**
 * 
 */
package create_pattern.singleton_pattern;

/**
 * 单例模式
 * @author Administrator
 *
 */
public class SingletonPatternDemo {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
	}
}
