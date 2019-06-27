/**
 * 
 */
package behavior_pattern.template_pattern;

/**
 * @author Administrator
 *
 */
public class Cricket extends Game {

	/* 
	 * @see behavior_pattern.template_pattern.Game#initialize()
	 */
	@Override
	void initialize() {
		System.out.println("Cricket Game initialize!");
	}

	/* 
	 * @see behavior_pattern.template_pattern.Game#startPlay()
	 */
	@Override
	void startPlay() {
		 System.out.println("Cricket Game startPlay!");
	}

	/* 
	 * @see behavior_pattern.template_pattern.Game#endPlay()
	 */
	@Override
	void endPlay() {
		 System.out.println("Cricket Game endPlay!");
	}

}
