/**
 * 
 */
package j2ee_pattern.business_delegate_pattern;

/**
 * @author Administrator
 *
 */
public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType){
		if(serviceType.equalsIgnoreCase("EJB")){
			return new EJBService();
		}else{
			return new JMSService();
		}
	}
}
