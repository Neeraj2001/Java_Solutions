import java.util.Scanner;
class yl_array
{
	public static void main(String args[])
	{
		Scanner b = new Scanner(System.in);	
		int arr[] = new int[6]; //if we declare array then it will be in static when we entered new then it will be heap 
		System.out.println("Gender:-");
		char c = b.next().charAt(0);
		for (int k=0;k<6 ;k++)
		{
       	arr[k] = b.nextInt();

		}
		for (int l:arr)
		{
		System.out.print(l + " ");
	    }
		int a[] = {2,4,6,7,8,9};
		// we can dec as int []a , int[] a
		for (int i:a)
		{
			System.out.println(i);
		}
		System.out.println("Gender is "+ c);
	}
}