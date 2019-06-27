/**
 * 
 */
package j2ee_pattern.business_delegate_pattern;

/**
 * @author Administrator
 *
 */
public class BusinessDelegatePatternDemo {

	/**
	 * @Description:业务代表模式
	 * 解耦，远程查询
	 * @param @param args
	 * @return void
	 * @author GongXinglin
	 * @date 2016-9-29下午5:18:07
	 */
	public static void main(String[] args) {
		   BusinessDelegate businessDelegate = new BusinessDelegate();
		   businessDelegate.setServiceType("EJB");
		   
		   Client client = new Client(businessDelegate);
		   client.doTask();
		   
		    businessDelegate.setServiceType("JMS");
		    client.doTask();
	}

}
