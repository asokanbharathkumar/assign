package Spring.Core.A8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext con= new ClassPathXmlApplicationContext("A8.xml");
		con.registerShutdownHook();
		Cust cus= (Cust) con.getBean("customer");
		System.out.println(cus);
	}

}