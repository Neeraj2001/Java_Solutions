import java.util.*;
import java.io.*;

class repeated_items_hashmap
{
	public static void main(String args[])
	{
		int arr[] = { 1 , 2 , 1 , 5 , 5 , 2 , 1 };
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			Integer c = hm.get(arr[i]);
			if(hm.get(arr[i]) == null)
			{
		        hm.put(arr[i] , 1);		
			}
			else
			{
				hm.put(arr[i] , ++c);
			}
		}
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println("No of "+m.getKey() + " " + m.getValue());
		}
	/*	HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		int a = Integer.MIN_VALUE;
		hmap.put(0,0);
		for(int j=0;j<hm.size();j++)
		{
            if(hm.get(arr[j]) > a)
            {
            	a = hm.get(arr[j]);
            	hmap.
            }
		}*/

		}
}