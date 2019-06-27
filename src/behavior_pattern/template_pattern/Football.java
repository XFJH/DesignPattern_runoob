/**
 * 
 */
package behavior_pattern.template_pattern;

/**
 * @author Administrator
 *
 */
public class Football extends Game {

	/* 
	 * @see behavior_pattern.template_pattern.Game#initialize()
	 */
	@Override
	void initialize() {
		System.out.println("Football Game initialize!");
	}

	/* 
	 * @see behavior_pattern.template_pattern.Game#startPlay()
	 */
	@Override
	void startPlay() {
		 System.out.println("Football Game startPlay!");
	}

	/* 
	 * @see behavior_pattern.template_pattern.Game#endPlay()
	 */
	@Override
	void endPlay() {
		 System.out.println("Football Game endPlay!");
	}

}
