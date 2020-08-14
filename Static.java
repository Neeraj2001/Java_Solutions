class Static
{
static int x=30;
static int y;
static boolean b;
public static void main(String args[])		
{
System.out.println(Static.x);
System.out.println(y);
System.out.println(b);
Static sobj = new Static();						
System.out.println(sobj);
}
}