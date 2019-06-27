/**
 * 
 */
package behavior_pattern.iterator_pattern;

/**
 * @author Administrator
 *
 */
public class IteratorPatternDemo {

	/**
	 * @Description:迭代器模式
	 * 透明顺序访问对象元素，职责分离
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-22上午9:07:39
	 */
	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		for(Iterator it = nameRepository.getIterator();it.hasNext();){
			String name = (String) it.next();
			System.out.println("name is:"+name);
		}
	}

}
