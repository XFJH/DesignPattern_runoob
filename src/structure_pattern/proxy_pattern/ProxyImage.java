/**
 * 
 */
package structure_pattern.proxy_pattern;

/**
 * @author Administrator
 *
 */
public class ProxyImage implements Image {
	private String fileName;
	private RealImage realImage;
	
	/**
	 * @param fileName
	 */
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	/* 
	 * @see structure_pattern.proxy_pattern.Image#display()
	 */
	@Override
	public void display() {
		if(null == realImage){
			realImage = new RealImage(fileName); 
		}
		realImage.display();
	}

}
