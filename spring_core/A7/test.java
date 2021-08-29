package Spring.Core.A7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bharath.xml");
		System.out.println("--------------------");
		
		Employee employee = (Employee) context.getBean("employee");
		System.out.println("Got employee object from the ApplicationContext(Spring Container)");
		System.out.println(employee);
	}
	
}
