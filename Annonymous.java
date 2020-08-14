class Annonymous
{
	static void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String args[])
	{
		display(new int[]{78,54,56,6,2,34,88,77});//Annonymous array
		
	}
}