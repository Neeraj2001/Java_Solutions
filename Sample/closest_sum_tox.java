import java.util.*;
import java.lang.Math;
class closest_sum_tox
{
	
	static void closest(int brr[],int n,int sum)
	{
      int l=0;
      int r=n-1;
      int res_l = 0;
      int res_r = 0;
      int diff = Integer.MAX_VALUE;
      while(l<r)
      {
       if(Math.abs(brr[l]+brr[r]-sum) < diff)
       {
        res_l = l;
        res_r = r;
       	diff = Math.abs(brr[l]+brr[r]-sum);
       } 
       if(brr[l]+brr[r]<sum)
       {
       	l++;
       }
       else
       {
       	r--;
       }
      }
      System.out.println("values are "+brr[res_l]+" "+brr[res_r]+" and diff is "+diff );
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of array elements");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter the sorted array");
        for(int i=0;i<a;i++)
        {
		 arr[i] = sc.nextInt();
       	}
	    System.out.println("Enter the sum");
	    int b= sc.nextInt();
	    closest(arr,a,b);
	}
	
}