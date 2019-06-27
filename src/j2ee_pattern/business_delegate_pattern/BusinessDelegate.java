/**
 * 
 */
package j2ee_pattern.business_delegate_pattern;

/**
 * @author Administrator
 *
 */
public class BusinessDelegate {
	private BusinessLookUp lookupService = new BusinessLookUp();
	  private BusinessService businessService;
	   private String serviceType;
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public void doTask(){
		businessService =  lookupService.getBusinessService(serviceType);
		  businessService.doProcessing();		
	}   
}
