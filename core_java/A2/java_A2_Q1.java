package a2;
class java_A2_Q1{
	private static java_A2_Q1 inst=null;
		private java_A2_Q1() {}
		public static java_A2_Q1 getInstance() {
		if(inst==null)
			inst= new java_A2_Q1();
		return inst;
	}
	public void message() {
		System.out.println("From Sigleton class");
	}
}
public class OOP_1 extends java_A2_Q1{
	public static void main(String[] args) {
		OOP_1 a= new OOP_1();
		a.message();
	}
}