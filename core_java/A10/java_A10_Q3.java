package A10;
import java.util.ArrayList;
import java.util.Arrays;
class java_A10_Q3 
{
	public static void main(String[] args)
	{
		String word = "A quick brown fox jumps over the lazy dog";
		ArrayList<String> sentence = new ArrayList<String>
		(Arrays.asList(word.split(" ")));
		System.out.println(sentence);
	}
}