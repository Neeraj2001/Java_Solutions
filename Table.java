import java.util.Scanner;
class Table
{
	//static int a=5;
	//static in
	public static void main(String[] args)
	{
		Scanner number = new Scanner(System.in);
		int a = number.nextInt();
		//number.close();
		for(int i=1;i<11;i++)
{
			System.out.println(a+" "+"x"+" "+i+" = "+a*i);
		}

	}
}