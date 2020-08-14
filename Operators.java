import java.util.Scanner;
class Operators
{
	public static void main(String args[])
	{
		Scanner t = new Scanner(System.in);
		System.out.println("Operators  \n1. Addition \n2.Subtraction");
		int tel = t.nextInt();
		switch(tel)
		{
			case 1:
			System.out.println("Addition");
			int a =t.nextInt();
			int b=t.nextInt();
			int c = a + b;
			System.out.println("Sum is "+c);
			break;

			case 2:
			System.out.println("Subtraction");
			 int ar = t.nextInt();
			 int br=t.nextInt();
			 int cr = ar - br;
			System.out.println("Sub is"+cr);
			break;
			
		}

		}


	}
