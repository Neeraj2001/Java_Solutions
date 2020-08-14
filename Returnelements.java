class ReturnElements
{
	static int[] value()
	{
		return new int []{23,45,6,4,65,34};
	}
	public static void main(String args[])
	{
		int a[] = value(); //calling value
		for (int i :a)
		{
			System.out.println(i);
		}
	}
	
}