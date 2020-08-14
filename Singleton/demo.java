class demo
{
	public static void main(String args[])
	{
	singleton s= singleton.getinstance();
	singleton s1= singleton.getinstance();
	s.show();
	s.dosomething();
	s1.dosomething();
	s.dosomething1();
	s1.dosomething1();


	}
}