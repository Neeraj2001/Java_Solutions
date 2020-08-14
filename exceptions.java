import java.util.*;

class exceptions
{
	public static void main(String args[])
	{ 

		int z =0 ;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter first no");
			int x= sc.nextInt();
			System.out.println("enter second no");
			int y= sc.nextInt();
			z=x/y;
		}
		catch(ArithmeticException e)//e is the var to Arithmatic excep
		{
			System.out.println("ArithmeticException");
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e);//this and above one are same
		}
		finally
		{
			System.out.println("ans is "+z);

		}
	}
}