import java.util.*;
class Student{  
 int rollno;  
 String name;  
 void insertRecord(int r, String n){  
  rollno=r;  
  name=n;  
 }  
 void display(){System.out.println(rollno+" "+name);}  
}  
class TestStudent4{
 public static void main(String args[]){
  Scanner r = new Scanner(System.in);
  int c = r.nextInt();
  String s = r.next();   
  Student s1=new Student();  
  //Student s2=new Student();  
  s1.insertRecord( c , s );  
  //s2.insertRecord(222,"Aryan");  
  s1.display();  
  //s2.display();  
 }  
}