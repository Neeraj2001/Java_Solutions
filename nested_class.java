class cloths
{
	String dress = "jeans";
	void display()
	{
	  class clothsinner
	 {
		void show()
		{
			System.out.println("my cloth are:"+dress);
		}
	}
	clothsinner a = new clothsinner();
	a.show();
}


	public static void main(String args[])
	{
		cloths cobj = new cloths();
		//cloths.clothsinner iobj =cobj. new clothsinner();
		cobj.display(); 
	}
}