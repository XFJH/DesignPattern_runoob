/**
 * 
 */
package structure_pattern.bridge_pattern;

/**
 * @author Administrator
 *
 */
public abstract class Shape {
	protected DrawAPI drawAPI;
	/**
	 * @param drawAPI
	 */
	public Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	public abstract void draw();
}
