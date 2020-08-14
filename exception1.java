class exception1
{
	public static void main(String args[])
	{
		int z = 0;
		try
		{
			int x =Integer.parseInt(args[1]);
			int y =Integer.parseInt(args[0]);
			z=x/y;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e);
		}
		finally
		{
			System.out.println("result" + z);
		}
	}
}