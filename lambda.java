interface drawable
{
	public void draw();
}
public class lamdademo
{
	public static void main(String args[])
	{
		int width =10;
		drawable d= ()->
		{
			System.out.println("Drawinng "+width);
		};
	}
}