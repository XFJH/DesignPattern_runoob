/**
 * 
 */
package structure_pattern.proxy_pattern;

/**
 * @author Administrator
 *
 */
public class RealImage implements Image {
	private String fileName;
	public RealImage(String fileName){
		this.fileName = fileName;
		loadFromDisk(fileName);
	}
	
	/* 
	 * @see structure_pattern.proxy_pattern.Image#display()
	 */
	@Override
	public void display() {
		System.out.println("display:"+fileName);
	}
	public void loadFromDisk(String fileName){
		System.out.println("load from disk:"+fileName);
	}
}
