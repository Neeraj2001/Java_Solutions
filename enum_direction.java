enum direction { NORTH ,south,west,east}
class enum_direction
{
	public static void main(String args[])
	{
		for (direction d : direction.values())
		{
			System.out.println(d);
		}
		System.out.println(direction.valueOf("NORTH"));  // if north is samll char then it shows illigal argument expression
		System.out.println(direction.valueOf("west").ordinal());//shows the index

	}
}