package structure_pattern.adapter_pattern;


/**
 * 适配器模式
 * 重在改变接口能力
 * @author Administrator
 *
 */
public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer ap = new AudioPlayer();
		ap.play("mp3", "hellel");
		ap.play("mp4", "hellel");
		ap.play("vlc", "hellel");
		ap.play("avi", "hellel");
	}
}
