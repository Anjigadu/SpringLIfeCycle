import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class EmployeeAspect {
	@Before("execution(public String getName())")
	public void getName(){
		System.out.println("execution of get name advise before the getname of the emplyee");
	}

}
