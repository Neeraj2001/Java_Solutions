class car
{
	void company(){}
}
class i10 extends car{
	void company()
	{
		System.out.println("i10 belongs to hyundii");
	}
}
class swift extends car{
	void company()
	{
		System.out.println("Swift belongs to maruthi");

	}
}
class nano extends car{
	void company()
	{
		System.out.println("nano belongs to tata");
	}
}
class hondacity extends car{
	void company()
	{
		System.out.println("hondacity belongs to honda");
	}
}
class vehicle
{
	public static void main(String args[])
	{
		car c1 = new i10();
		c1.company();
		car c2 = new swift();
		c2.company();
		car c3 = new nano();
		c3.company();
		car c4 = new hondacity();
		c4.company();
		

	}
}