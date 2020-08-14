interface regno
{
	public int rollno(int n);
}
public class lamdademo2
{
	public static void main(String args[])
	{
		regno r1= (n)->
		{
			return n;
		};
		System.out.println(r1.rollno(1)+" is your rollno");
		regno r2 = n ->
		{
			return n;
		};
		System.out.println(r2.rollno(2)+" is my rollno");
	}
}