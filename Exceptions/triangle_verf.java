import java.util.*;
class IllegalTriangleException
{

}
class triangle_verf 
{
	triangle_verf(int a,int b,int c)
	{
		if(a+b>c || b+c>a || c+a>b)
		{
			System.out.println("Triangle can be formed");
		}
		else
		{
			throw new IllegalTriangleException("IllegalTriangleException");
		}
	}
	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);
            System.out.println("enter three sides of triangle");            
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();	
	}
}