interface print
{
	default void show()
	{
		System.out.println("interface default method is called");  // to print this we need to declare as static
	}
}
public class test_default implements print{
	public void show()
	{
		System.out.println("default methods is Override in class");
	}
	public static void main(String...ag)
	{
		print obj1 = new test_default();
		obj1.show();
	 test_default obj = new test_default();
	 obj.show();

	}
}