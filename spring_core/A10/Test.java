package Spring.Core.A10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("A10.xml");
		Cust cus= (Cust) con.getBean("customer");
		System.out.println(cus);
	}

}