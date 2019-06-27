/**
 * 
 */
package j2ee_pattern.composite_entity_pattern;

/**
 * 组合模式
 * 就是各种组合
 * @author Administrator
 *
 */
public class CompositeEntityPatternDemo {
	public static void main(String[] args) {
		  Client client = new Client();
		  client.setData("Test", "Data");
		  client.printData();
		  
		  client.setData("second test","second test");
		  client.printData();
	}
}
