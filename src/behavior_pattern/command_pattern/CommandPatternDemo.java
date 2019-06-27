/**
 * 
 */
package behavior_pattern.command_pattern;

/**
 * @author Administrator
 *
 */
public class CommandPatternDemo {

	/**
	 * @Description:命令模式
	 * 数据驱动的设计模式，合适的对象执行，降低耦合
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-21上午10:48:34
	 */
	public static void main(String[] args) {
		Stock stock = new Stock();
		BuyStock buyStock = new BuyStock(stock);//命令对象
		SellStock sellStock = new SellStock(stock);
		
		Broker bk = new Broker();
		bk.takeOrder(buyStock);
		bk.takeOrder(sellStock);
		bk.placeOrders();
	}

}
