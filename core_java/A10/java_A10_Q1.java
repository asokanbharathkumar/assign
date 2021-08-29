package A10;
interface Interf
{
	public abstract int si (int p, int r, int t);
}

public class java_A10_Q1 {

	public static void main(String args[])
	{
	   Interf i =  (p,r,t) -> (p*r*t)/100;
	   System.out.println(i.si(1000, 2, 10));
	}
}
