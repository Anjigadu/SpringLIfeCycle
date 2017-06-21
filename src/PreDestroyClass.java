import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;

public class PreDestroyClass {//implements DisposableBean {

	/*@Override
	public void destroy() throws Exception {
		System.out.println("before destroy the bean this method will call");
		
	}*/

	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@PreDestroy
	 public void destroy(){
		 System.out.println("before destroy the bean this method will call");
	 }
}
