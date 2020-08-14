class traffic
{
	static String color="red";
	static class control
	{
		void show()
		{
			System.out.println("color is "+color);
		}
	}
	public static void main(String args[])
	{
		traffic.control obj = new traffic.control();
		obj.show();
	}
}