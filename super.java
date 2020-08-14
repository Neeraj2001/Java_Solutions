class superdemo
{
	String color = "red";
}
class superdemo1 extends superdemo
{
	String color = "green";
	void show()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
class superns
{
	public static void main(String args[])
	{
		superdemo1 obj = new superdemo1();
		obj.show();
	}
}