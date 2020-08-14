interface show
{
	void display();
	interface showname
	{
		void name();
	}
}
class demo implements show{
	public void display()
	{
		System.out.println("hew are you");

	}
}
class inner_interf implements show.showname
{
	public void display()
	{
		System.out.println("My name is neeraj");
	}
	public static void main(String args[])
	{
		show obj = new demo();
		obj.display();
		show.showname obj1 = new inner_interf();
		obj1.name();
	}
}