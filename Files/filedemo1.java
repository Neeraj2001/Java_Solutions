import java.io.File;
class filedemo1{
public static void main(String args[]){
try{
File obj=new File("E:\\Java Programms\\Files\\myanotherfile.xls");
if(obj.createNewFile())
{
System.out.println("File Created");
}
else
{
System.out.println("File already exist.");
}


File fobj=new File("E:\\Java Programms\\Files\\myfile.doc");
if(fobj.createNewFile())
{
System.out.println("File Created");
}
else
{
System.out.println("File already exist.");
}
//System.out.println(fobj.setReadOnly());//just giving read and execute permission only not write
System.out.println(fobj.canWrite());
System.out.println("Changinging its permission:- "+fobj.setWritable(false));
System.out.println(fobj.canWrite());
System.out.println(fobj.canRead());
System.out.println(fobj.canExecute());
System.out.println(fobj.getName());
System.out.println(fobj.getParent());
System.out.println(fobj.getFreeSpace());
System.out.println(fobj.isFile());
System.out.println(fobj.isHidden());
System.out.println(fobj.lastModified());
System.out.println(fobj.exists());

//System.out.println(fobj.delete());//delete the file from folder

/*File fobj1=new File("D:\\shruti\\lpu java programs");
String listoffile[]=fobj1.list();
for(String list:listoffile)
{
System.out.println(list);
}*/
File obj3=new File("Directories");
obj3.mkdir();
System.out.println("Is it directory? "+obj3.isDirectory());
System.out.println("name of directory "+ obj3.getName());
}
catch(Exception e)
{
e.printStackTrace();
}
}}