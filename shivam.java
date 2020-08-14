import java.util.*;
interface bud
{
void fun1(long []arr1);
}


class budget
{

 void fun1(long []arr1)
{
long sum=0;
Scanner sc=new Scanner(System.in);
for(int i=0;i<arr1.length;i++)
{
sum=sum+arr1[i];
}

System.out.println("total spent money : "+sum);
System.out.println("Enter your income: ");
long in=sc.nextLong();
long a=in-sum;
System.out.println("money you left with: "+a);
System.out.println("money you spend: "+sum);
}


public static void main(String args[]){
try
{
Scanner sc=new Scanner(System.in); 
long arr[];
arr = new long[10]; 
System.out.println("enter Amount for Electricity: ");
 long n=sc.nextLong();
arr[0]=n;
System.out.println("enter Amount for gasbill: ");
  arr[1]=sc.nextLong();
System.out.println("enter Amount for waterBill: ");
  arr[2]=sc.nextLong();
System.out.println("enter Amount for transportbill: ");
  arr[3]=sc.nextLong();
System.out.println("enter Amount for foodbill: ");
  arr[4]=sc.nextLong();
System.out.println("enter Amount for medical: ");
  arr[5]=sc.nextLong();
System.out.println("enter Amount for loan: ");
  arr[6]=sc.nextLong();
System.out.println("enter Amount for other things: ");
  arr[7]=sc.nextLong();
System.out.println("Value you enterd");
Arrays.stream(arr).forEach(num -> System.out.println(""+num+""));
budget obj = new budget();
obj.fun1(arr);
}
catch(InputMismatchException exp)
	{
		System.out.println("you enter error");
	} 

//System.out.println("--------------------------------------------------end of program-------------------------------------------------");
}
}