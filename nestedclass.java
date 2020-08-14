abstract class light
{
	abstract void traffic();

}
class anonymousk18ns
{
	public static void main(String args[])
	{
	light l = new light()
	{
	void traffic()
	{
	System.out.println("color is red");
	}
	};
	l.traffic();
	}
}