class student
{
int id;
String name;
student(int id,String name)
{
this.id=id;
this.name=name;
}
void display()
{
System.out.println(id+","+name);
}
}
class studentns
{
public static void main(String args[])
{
student obj=new student(1,"nikitha");
obj.display();
}
}