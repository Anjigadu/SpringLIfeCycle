import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;

public class PostInitializationClass {// implements InitializingBean{

	/*@Override
	public void afterPropertiesSet() throws Exception {
	System.out.println("after initialisation of bean this method will call");
		
	}*/
	private String message;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@PostConstruct
 public void init(){
	 System.out.println("after initialisation of bean this method will call");
 }
}
