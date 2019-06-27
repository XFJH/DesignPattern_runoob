/**
 * 
 */
package structure_pattern.flyweight_pattern;

/**
 * @author Administrator
 *
 */
public class Circle implements Shape {
	private String color;
	private int x;
	private int y;
	private int radius;
	public Circle(String color){
		this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	/* 
	 * @see structure_pattern.flyweight_pattern.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color 
		         +", x : " + x +", y :" + y +", radius :" + radius);
	}

}
