class enum_construct
{
enum dress
{
	jeans(13),shirt(24),short(35);
	private int x;
	private dress(int y)//
	{
		x = y;
	}
}	
public static void main(String args[])
{
	for (dress d : dress.values())
	{
		System.out.println(d);
		System.out.println(d+" "+d.x);
		//S0ystem.out.println(d.value)

	}

}
}