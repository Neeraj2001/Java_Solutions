import java.util.Scanner;
import java.lang.Math;
class All_programms
{
	static int a = 0;
	static int b = 1;
	static int d;
	
	 
	public static void main(String[] args)
	{
		Scanner t = new Scanner(System.in);
		System.out.println("1 : Fibonacci"+'\n'+"2 : Prime_Number"+"\n3 : Palindrome"+"\n4 : Armstrong");
        //System.out.println("2 : Prime_Number");
		int sel = t.nextInt();
	switch (sel)
	{
		case 1:
		System.out.print("Fibonacci_Number");
		Scanner num = new Scanner(System.in);
		 int c = num.nextInt();
		
		System.out.println(a+ "\n"+b);
		//System.out.println(b);
		for (int i=1;i<c;i++)
		{
			d=a+b;
			System.out.println(d);
			a = b;
			b = d;
		}
	break;
	case 2:
	System.out.println("Prime_Number");
	int value = t.nextInt();
	int count=0;
	for (int i=1;i < value;i++)
	{
		if(value%i==0)
		{
			count+=1;
		}
	}
		if(count>2)
		{
			System.out.println(value +"is not a Prime");
		}
		else{

			System.out.println(value +"is a Prime_Number");
		}
	
	break;
	case 3:
	int temp=0;
	System.out.println("Palindrome");
	int pal=t.nextInt();
	int p=pal;
	while(p>0)
	{
		temp=temp*10+p%10;
		p=p/10;
	}
	if ( pal == temp)
	{
		System.out.println(pal + " is a Palindrome");
	}
	else{
		System.out.println(pal + " is not a Palindrome");
	}
	break;
	case 4:
	System.out.println("Armstrong");z
	int arm = t.nextInt();
	//double tem=0; or
	int tem = 0;
	int b = arm;
	int f;
	int po=Integer.toString(arm).length();
	while(b > 0)
	{
		f=b%10;
		//tem=tem+Math.pow(f,po);  if double is used then no need of keeping int 
		tem=tem+(int)Math.pow(f,po);//if int not given then it will be double
		b=b/10;
	}
	if ( tem == arm)
	{
		System.out.println(arm+" is an Armstrong Number");
	}
	else{
		System.out.println(arm+" is not an Armstrong Number");

	}
	break;
	default:
	System.out.println("Try again");

}
}

}
