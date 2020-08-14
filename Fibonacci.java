import java.util.Scanner;
class Fibonacci
{
	static int a = 0;
	static int b = 1;
	static int d;
	public static void main(String[] args)
	{
		Scanner num = new Scanner(System.in);
		int c = num.nextInt();
		num.close();
		System.out.println(a+ "\n"+b);
		//System.out.println(b);
		for (int i=1;i<c;i++)
		{
			d=a+b;
			System.out.println(d);
			a = b;
			b = d;
		}

	}
}