/**
 * 
 */
package create_pattern.builder_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Meal {
	private List<Item> itemList = new ArrayList<Item>();
	public void addItem(Item item){
		itemList.add(item);
	}
	public float getCost(){
		float cost = 0.0f;
		for(Item item:itemList){
			cost += item.price();
		}
		return cost;
	}
	public void showItems(){
		for(Item item:itemList){
			System.out.println("item:"+item.name());
			System.out.println(",packing:"+item.packing().pack());
			System.out.println(",price:"+item.price());
		}
	}
}
