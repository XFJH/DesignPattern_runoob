/**
 * 
 */
package behavior_pattern.command_pattern;

/**
 * @author Administrator
 *
 */
public class BuyStock implements Order {
	private Stock abcStock;
	/**
	 * @param abcStock
	 */
	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}
	/* 
	 * @see behavior_pattern.command_pattern.Order#execute()
	 */
	@Override
	public void execute() {
		abcStock.buy();
	}

}
