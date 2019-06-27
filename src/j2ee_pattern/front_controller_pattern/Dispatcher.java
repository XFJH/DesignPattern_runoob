/**
 * 
 */
package j2ee_pattern.front_controller_pattern;

/**
 * @author Administrator
 *
 */
public class Dispatcher {
	  private StudentView studentView;
	   private HomeView homeView;
	   public Dispatcher(){
		      studentView = new StudentView();
		      homeView = new HomeView();
		   }
	   public void dispatch(String request){
		      if(request.equalsIgnoreCase("STUDENT")){
		         studentView.show();
		      }else{
		         homeView.show();
		      }	
		   }
}
