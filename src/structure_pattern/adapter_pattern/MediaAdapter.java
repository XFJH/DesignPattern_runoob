package structure_pattern.adapter_pattern;
/**
 * @author Administrator
 *
 */
public class MediaAdapter implements MedialPlayer {
	AdvancedMediaPlayer amp;
	/* 
	 * @see create_pattern.adapter_pattern.MedialPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			amp = new VlcPlayer();
			amp.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			amp = new Mp4Player();
			amp.playMp4(fileName);
		}
	}

}
