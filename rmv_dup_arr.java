import java.util.*;
class rmv_dup_arr
{
	static void remove(String str)
	{
		String result;
		int a = str.length();
		int i=0,l=0;
		for( i=0;i<a;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(str[i] == str[j])
				{
					//result[i] = str[i];
					break;
				}

			}
			if(i == j)
			{
				result[l] = str[i];
				l++;
			}
		}
		for (i=0;i<l;i++)
		{
		System.out.print(result[i]);
	}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string to remove duplicate");
		String s = sc.nextLine();
		remove(s);
	}
}