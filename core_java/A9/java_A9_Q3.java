package A9;
import java.util.*;
public class java_A9_Q3 
{	
	public static void main(String[] args) 
	{
		List<java_A9_Q1> fruits= new ArrayList<>(List.of(
				new java_A9_Q1("Apple", 65, 30, "Red"),
				new java_A9_Q1("Mango", 120, 80, "Yellow"),
				new java_A9_Q1("Banana", 80, 40, "Yellow"),
				new java_A9_Q1("Orange", 60, 25, "Orange"),
				new java_A9_Q1("Pomegrenate", 70, 50, "Red")
			));
		
		List<java_A9_Q2> news= Arrays.asList(
				new java_A9_Q2(12, "bruce", "Steve", "One last trip"),
				new java_A9_Q2(25, "Steve", "Bruce", "No!, budget is not settled"),
				new java_A9_Q2(65, "Steve", "Tony", "No need to worry about the budget"),
				new java_A9_Q2(41, "Tony", "Thor", "Nice")
				);
		System.out.println("1");
		fruits.stream().filter(fruit -> fruit.getCalories()<100)
		.sorted((f1, f2) -> f2.getCalories()-f1.getCalories()).forEach(System.out::println);

		System.out.println("2");
		fruits.stream().sorted((f1, f2) -> f1.getColor().compareTo(f2.getColor()))
		.forEach(f-> System.out.println(f.getColor()+" "+f.getName()));
		
		System.out.println("3");
		fruits.stream().filter(f -> f.getColor()=="Red")
		.sorted((f1, f2) -> f1.getPrice()-f2.getPrice()).forEach(System.out::println);
		
		System.out.println("4");
		System.out.println(news.stream().sorted((n1,n2) -> n2.getComment().compareTo(n1.getComment())).findFirst());
		
		System.out.println("5");
		news.stream().forEach(n -> {
		});
	}
}