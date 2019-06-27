package structure_pattern.adapter_pattern;
/**
 * @author Administrator
 *
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	/* 
	 * @see create_pattern.adapter_pattern.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
		System.out.println("playvlc");
	}

	/* 
	 * @see create_pattern.adapter_pattern.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

}
