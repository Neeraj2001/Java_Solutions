//import java.util.Scanner;
class Max
{
	
	 void max(int arr[])
	{
		int max =arr[0];
	}
	void calculate_max(){

		for (int i=1 ;i<arr.length;i++)
		{
			if (max <arr[i])
				max = arr[i];
			
		}
		System.out.println("max is "+max);
	}

}
class max_array
{
	
		
			public static void main(String args[])
	{
		calculate_max m1 =new calculate_max();
		Max m =new Max();
		m.insert (2,34,6,4,7,44,5);
		m.calculate_max();//passing array inside method

}
	
}



