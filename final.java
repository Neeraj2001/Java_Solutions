class finaldemo
{
	final String color  = "red";
	void light()
	{
	color = "green";
	}
}
class finalns
{
	public static void main(String args[])
	{
	finaldemo obj = new finaldemo();
	obj.light();
	}
}


