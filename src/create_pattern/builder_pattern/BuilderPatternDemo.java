/**
 * 
 */
package create_pattern.builder_pattern;

/**
 * 建造者模式
 * 有一种构建的意思
 * @author Administrator
 *
 */
public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mb = new MealBuilder();
		
		Meal vegmeal = mb.prepareVegMeal();
		vegmeal.showItems();
		
		Meal nonvegmeal = mb.prepareNonVegMeal();
		nonvegmeal.showItems();
		
	}
}
