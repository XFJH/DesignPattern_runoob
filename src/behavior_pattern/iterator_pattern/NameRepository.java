/**
 * 
 */
package behavior_pattern.iterator_pattern;

/**
 * @author Administrator
 *
 */
public class NameRepository implements Container {
	public String names[]={"robert","john","julie","lora"};
	/* 
	 * @see behavior_pattern.iterator_pattern.Container#getIterator()
	 */
	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}
	private class NameIterator implements Iterator{
		int index;
		/* 
		 * @see behavior_pattern.iterator_pattern.Iterator#hasNext()
		 */
		@Override
		public boolean hasNext() {
			if(index<names.length){
				return true;
			}
			return false;
		}

		/* 
		 * @see behavior_pattern.iterator_pattern.Iterator#next()
		 */
		@Override
		public Object next() {
			if(this.hasNext()){
				return names[index++];
			}
			return null;
		}
		
	}
}
