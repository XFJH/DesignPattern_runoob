/**
 * 
 */
package j2ee_pattern.composite_entity_pattern;

/**
 * @author Administrator
 *
 */
public class CompositeEntity {
	   private CoarseGrainedObject cgo = new CoarseGrainedObject ();
	   public void setData(String data1,String data2){
		   cgo.setData(data1, data2);
	   }
	   public String[] getData(){
		   return cgo.getData();
	   }
}
