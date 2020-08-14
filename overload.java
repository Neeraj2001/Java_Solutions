class overload
{
	static double sum(double a,double b)
	{
		return a+b;

	}
	static int sum(int a,int b,int c)
	{
		return a+b+c;

	}
	public static void main(String args[])
	{
		System.out.println(overload.sum(8.77,6.78));
		System.out.println(overload.sum(8,9,6));
	}
}