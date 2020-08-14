import java.util.*; 
/*class prime_range
{
	static void prime(int b,int c)
	{
		for(int i=b;i<c;i++)
			{
				int count =0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count == 2)
				{
					System.out.print(i+" ");
				}
			}
			System.out.println(); 
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a>0)
{	
	     a--;
		int b = sc.nextInt();
		int c = sc.nextInt();
		prime(b,c);	
		}
	}
}*/


class prime_range
{
	static int prime(int a)
	{
       if(a<=1)return 0;
       for(int i=2;i*i<=a;i++)
       {
       	if(a%i ==0)return 0;
       }
       return 1;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0)
		{
			int a =sc.nextInt();
			int b = sc.nextInt();
			for(int i=a;i<=b;i++)
			{
				if(prime(i) == 1)
				{
					System.out.print(i+" ");
				}
			}
		}

	}
}