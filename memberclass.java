class cloths
{
	String dress = "jeans";
	class clothsinner
	{
		void show()
		{
			System.out.println("my cloth are:"+dress);
		}
	}
}
class memberk18ns
{
	public static void main(String args[])
	{
		cloths cobj = new cloths();
		cloths.clothsinner iobj =cobj. new clothsinner();
		iobj.show(); 
	}
}