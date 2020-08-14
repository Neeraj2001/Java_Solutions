//like a class an interfece can have methods an dvariables but the methods declared in interface are bydefault abstract 
//WAP in which u have to declare an interface and in this there is only one abstract method named as number which takes an integer number
 //as an input and the total number of prime numbers bw 2 and integer k . first line contains int t that denotes test cases o/p be like 
//print total no of prime numbers bw 2 and given number

import java.util.*;
interface no_prime
{
	public int prime(int n);
}
class interface_prime implements no_prime
{
	public int prime(int n)
	{
		int c=0;
		for(int i=2;i<n;i++)
		{
			for(int j=2;j<=i;j++)
			
			{
			  if(i%j == 0) break;
			  if(i == j)  c=c+1;
				
			}
		}
		return c;
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter no of Test cases:");
		int k = input.nextInt();
		while(k-- >0)
		{
			System.out.println("enter no:");
		int num =input.nextInt();
		interface_prime obj = new interface_prime();
		int d = obj.prime(num);
  	     System.out.println("no of primes:"+d);
  	 }

		}

}