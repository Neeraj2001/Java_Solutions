class Max
{
	static void max(int arr[])
	{
		int max =arr[0];
		for (int i=1 ;i<arr.length;i++)
		{
			if (max <arr[i])
				max = arr[i];
			
		}
		System.out.println("max is "+max);
	}
	public static void main(String args[])
	{
		//Max m =new Max();
		int a[] = {2,34,6,4,7,44,5};
		max(a);//passing array inside method


	}
}