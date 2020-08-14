interface intr
{
	public void student();
	public void faculty();
	public void officer();
	public void clerk();
}
abstract class demo implements intr
{
	public void student()
	{
		System.out.println("i am student");
	}
}
class demo1 extends demo
{
	public void faculty()
	{
		System.out.println("i am faculty");
	}
	public void officer()
	{
		System.out.println("i am officer");
	}
	public void clerk()
	{
		System.out.println("i am clerk");
	}
	public static void main(String args[])
	{
		intr i = new demo1();  //  i is an var of parent cls intr
		i.student();
		i.faculty();
		i.officer();
		i.clerk();
	}
}