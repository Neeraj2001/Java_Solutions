import java.util.*;
class prime
{
	public static void main(String args[])
	{
	//long n;
	Scanner input = new Scanner(System.in);
	System.out.println("enter number to find prime");
	long n = input.nextLong();
	System.out.println(n);
	if ((n + 1 ) % 6 == 0 || ( n - 1)%6 ==0 )
	{
		System.out.println(n+" "+" is a prime number");
	}
	else if( n == 2 || n == 3  )
	{
		System.out.println(n+" "+" is a prime number");
	}
	else{
		System.out.println(n+" "+" is NOT a prime number");
	}

	}
}