/**
 * 
 */
package create_pattern.prototype_pattern;

/**
 * @author Administrator
 *
 */
public class PrtotypePatternDemo {

	/**
	 * @Description:原型模式
	 * 从已有对象克隆得到
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-14下午12:44:47
	 */
	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape s = ShapeCache.getShape("1");
		System.out.println(s.getType());
		
		
		Shape sq = ShapeCache.getShape("2");
		System.out.println(sq.getType());
	}

}
