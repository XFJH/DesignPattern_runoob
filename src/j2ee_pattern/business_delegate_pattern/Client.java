/**
 * 
 */
package j2ee_pattern.business_delegate_pattern;

/**
 * @author Administrator
 *
 */
public class Client {
	BusinessDelegate businessService;
	  public Client(BusinessDelegate businessService){
	      this.businessService  = businessService;
	   }
	  public void doTask(){		
	      businessService.doTask();
	   }
}
