interface show
{
	static void print()
	{
		System.out.println("interface default method is called");
	}
}
public class test_static implements show{
	public void print()
	{
		System.out.println("default methods is Override in class");
	}
	public static void main(String...ag)
	{
		test_static obj = new test_static();
	    obj.print();
	  show.print();  
	 	
	}
}