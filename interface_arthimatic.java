//you are given an interface arthimatic which cantaints an abstract method signature int diviser(int n),you need to write a class
 //called as my calculator which implements the interface .
//divesor fux jsut take an integer as an input from user and return the sum of all the divisers  
import java.util.*;
interface arthimatic
{
  public int divisor(int n)
}
class my_calculator implements arthimatic
{
	public int divisor(int n)
	{
			int c=0;
         	int i;
  	      for(i=1;i<=n;i++)
  	     {
  		  if(n%i==0)
  		  {
  			c=c+i;
  		   } 
  	     }
	}
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter no:");
		int num =input.nextInt();
		my_calculator obj = new my_calculator();
		int c = obj.divisor(num)
  	     System.out.println("arthimatic:"+c);
		}
	}
