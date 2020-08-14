class singleton
{
	private static singleton instance; //static keyword
	private singleton() //private const
	{}
	public static singleton getinstance() //factory method
	{
		if (instance == null) //lazy mehod
		{
			instance = new singleton();
		}
		return instance;
	}
	void show()
	{
		System.out.println("hello");
		System.out.println(instance);
	}
	void dosomething()
	{
		System.out.println("hello java");


	}
	void dosomething1()
	{
		System.out.println("hello students");
	}

}
