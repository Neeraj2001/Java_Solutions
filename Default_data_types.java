class Default_data_types{
 boolean a;
static char b;
static byte c;
static short d;
static int e;
static long f;
static float g;
static double h;
public static void main(String args[])
{
Default_data_types obj=new Default_data_types();
//if we dont use STATIC before data types then we neesd to create an obj to access
System.out.print("Default value of integer:-"+obj.a);
System.out.println(b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
}
}