import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;

public class MyServiceClass implements ApplicationContextAware,BeanNameAware,BeanFactoryAware,ResourceLoaderAware,ApplicationEventPublisherAware{

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		arg0.getBeanDefinitionNames();
		
		System.out.println("Arrays of bean definations "+Arrays.toString(arg0.getBeanDefinitionNames()));
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println( "Bean Aware Interface will give you"+arg0);
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(arg0.isSingleton("twitter"));
	}

	@Override
	public void setResourceLoader(ResourceLoader arg0) {
		// TODO Auto-generated method stub
		//System.out.println(arg0.getResource(""));
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		// TODO Auto-generated method stub
		
	}

}
