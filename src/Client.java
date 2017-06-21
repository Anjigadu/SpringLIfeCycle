import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String args[]){
		
		
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		applicationContext.getBean(PostInitializationClass.class);
		applicationContext.getBean(PreDestroyClass.class);
		applicationContext.close();
	}
}
