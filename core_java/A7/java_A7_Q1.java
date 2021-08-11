package A7;
import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test
{
	String value();
}
public class java_A7_Q1 
{	
	@Test("test-case")
	void testMethod() 
	{
		System.out.println("This is from the testMethod");
	}
	public static void main(String[] args) 
	{
		java_A7_Q1 a= new java_A7_Q1();	
		a.testMethod();
		try 
		{
			Method m = a.getClass().getDeclaredMethod("testMethod");
				System.out.println(m);		
			Annotation ann= m.getAnnotation(Test.class);
			Test t= (Test)ann;
			System.out.println("The method is a "+t.value());
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
}