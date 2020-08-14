class method 
{
int a;
int b;
void add(int a,int b)
{
this.a=a;
this.b=b;
int c=a+b;
System.out.println("Addition of two numbers:-"+c);
}
void mull(int a,int b)
{
this.a=a;
this.b=b;
int c=a*b;
System.out.println("Multiplication of two numbers:-"+c);
this.add(3,4);
}
}
class methodns
{
public static void main(String args[])
{
method obj=new method();
obj.mull(2,3);
}
}
