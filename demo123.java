/* Q. Like a class an interface have methods and variables but method decleare in interface are by default abstract .
 Write a program in which you have to decleare an interface and in this there is only one abctract method name as 
numberwhich take integer number as a input and total number of prime number or integer that user enter.
1.first line with contain an interp that denote test cases.
2.second line output like print total number of prime number between 2 and given number.*/

import java.util.Scanner;
interface prime
{
public int number(int n);
}
class demo123 implements prime
{
public int number(int n)
{

int a=0;                                                                                                                                 
for(int i=2;i<=n;i++)
{
int count=0; 
for (int j=i;j>=1;j--)
{
if(i%j==0)
{
count=count+1;
}
}
//System.out.println(count);
if (count==2)
{
a=a+1;
}}
System.out.println(a);
return a;
}

public static void main(String args[])
{
demo123 obj=new demo123();
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
obj.number(x);
}
}