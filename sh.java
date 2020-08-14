/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static void shadow(int arr[] , int n)
    {
        if(n == 0 || n ==1) 
         {
             System.out.print(n);
             return;
         }
        int j =0,val=0;
        for(int i =0;i<n-1;i++)
        {
            if(arr[i] != arr[i + 1])
            {
                arr[j++] = arr[i];
            }
            if(arr[i] == arr[i + 1])
            {
                val = arr[i];
            }
            arr[j] = arr[n - 1];
        }
        System.out.println(val+" ");
        int rep = 1;
        for(int i=0;i<j;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=2;i<=(j+1);i++)
        {
            rep += i;
            rep -= arr[i-2];
        }
        System.out.println(rep+"\n");
        
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    
		    int n = sc.nextInt();
            int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    shadow(arr,n);
		}
	}
}