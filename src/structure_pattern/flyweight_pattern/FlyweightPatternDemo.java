/**
 * 
 */
package structure_pattern.flyweight_pattern;

/**
 * @author Administrator
 *
 */
public class FlyweightPatternDemo {
	private static final String colors[] = {"red","green","blue","white","black"};
	/**
	 * @Description:享元模式
	 * 重在减少对象,提高性能
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-20下午2:13:43
	 */
	public static void main(String[] args) {
		for(int i=0;i<20;i++){
			String colorTemp = getRandomColor();
			Circle circle = (Circle)ShapeFactory.getCircle(colorTemp);
			circle.setX(getRandomX());
			circle.setX(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
	}
	private static String getRandomColor(){
		return colors[(int)(Math.random()*colors.length)];
	}
	private static int getRandomX(){
		return (int)(Math.random()*100);
	}
	private static int getRandomY(){
		return (int)(Math.random()*100);
	}
}
