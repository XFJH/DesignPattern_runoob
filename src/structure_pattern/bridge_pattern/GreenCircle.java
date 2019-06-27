/**
 * 
 */
package structure_pattern.bridge_pattern;

/**
 * @author Administrator
 *
 */
public class GreenCircle implements DrawAPI {

	/* 
	 * @see structure_pattern.bridge_pattern.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		 System.out.println("Drawing Circle[ color: green, radius: "
		         + radius +", x: " +x+", "+ y +"]");
	}

}
