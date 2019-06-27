/**
 * 
 */
package behavior_pattern.template_pattern;

/**
 * @author Administrator
 *
 */
public abstract class Game {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	public final void play(){
		initialize();
		startPlay();
		endPlay();
	}
}
