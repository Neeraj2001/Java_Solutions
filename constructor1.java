class student
{
int id;
String name;
char gender;
long mobile;
student(int sid,String sname,char g,long mno)
{
id=sid;
name=sname;
gender=g;
mobile=mno;
}
void display()
{
System.out.println(id+","+name+","+gender+","+mobile+".");
}
}
class studentns
{
public static void main(String args[])
{
student obj=new student(143,"sharukh khan",'M',1223);
obj.display();
student obj1=new student(123,"frank",'M',14467);
obj1.display();
student obj2=new student(555,"vikas",'M',7013161);
obj2.display();

}
}