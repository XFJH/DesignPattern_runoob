package structure_pattern.adapter_pattern;

/**
 * @author Administrator
 *
 */
public class Mp4Player implements AdvancedMediaPlayer {

	/* 
	 * @see create_pattern.adapter_pattern.AdvancedMediaPlayer#playVlc(java.lang.String)
	 */
	@Override
	public void playVlc(String fileName) {
	}

	/* 
	 * @see create_pattern.adapter_pattern.AdvancedMediaPlayer#playMp4(java.lang.String)
	 */
	@Override
	public void playMp4(String fileName) {
		System.out.println("play mp4");
	}

}
