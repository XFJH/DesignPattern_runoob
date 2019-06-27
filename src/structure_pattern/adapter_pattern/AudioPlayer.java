package structure_pattern.adapter_pattern;
/**
 * @author Administrator
 *
 */
public class AudioPlayer implements MedialPlayer {
	MediaAdapter ma;
	/* 
	 * @see create_pattern.adapter_pattern.MedialPlayer#play(java.lang.String, java.lang.String)
	 */
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("mp3 play"+fileName);
		}else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
			ma = new MediaAdapter();
			ma.play(audioType,fileName);
		}else{
			System.out.println("not support");
		}
	}

}
