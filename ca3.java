/*Write a java program to implement Home Budget Managemen.In which you have to include at least three from the given topicsas 
required: Inheritance, Overriding Methods, Polymorphism, Abstract Classes, Nested Classes, Interfaces, Lambda Expressions, 
Exceptional Handling and I/O Fundamentals.Avoid copying from given solution on website.Try to implement using the concept 
covered in the class.Solution must be unique for each student.Roll Number:37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,73
*/
import java.util.*;
import java.io.*;
interface intr
{
	public void home();
	public void inputs();
}
abstract class abs implements intr
{
    public void home()
    {
       System.out.println("   Home Budget Management System \n");
    }
}
class budget
{
	int bill;
	public budget(int bill)
	{
		super();
		this.bill = bill;
	}
}
class home_management extends abs
{
	public static void file()
	{
       File f = new File("E:\\Java Programms\\Files\\home_management.txt");
        OutputStream os= new BufferedOutputStream(new FileOutputStream("E:\\Java Programms\\Files\\home_management.txt"));
        String s = " Home Budget Management System\n ";
        byte[] b =s.getBytes();
        os.write(b);
        s = "1 . House Rent\n2 . Electicity\n3 . Water\n4 . Gas\n5 . Grocery\n6 . Cloths";
        b = s.getBytes();
        os.write(b);
        List<String> slist = new ArrayList<String>();
        slist.add("House Rent");
        slist.add("Electicity");
        slist.add(" Water");
        slist.add("Gas");
        slist.add("Grocery");
        slist.add("Cloths");
        iterator itr = slist.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


	}
	public static void main(String args[]) throws Exception
	{
		
        Scanner sc = new Scanner(System.in);
        intr obj = new home_management();
        obj.home();
        System.out.println("1 . House Rent\n2 . Electicity\n3 . Water\n4 . Gas\n5 . Grocery\n6 . Cloths");
        file();
        System.out.println("Enter the Bill Amount: ");
        //int ar[] = new int[10];
        List<budget> list = new ArrayList<>();
         for(int i=1;i<=6;i++)
        {
            String s1;
            if(i == 1)
            {
                System.out.println("House Rent");
                int bill =sc.nextInt();
                 s1 = String.valueOf(bill);
                 s = "\n Home Rent : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            }
            if(i == 2)
            {
                System.out.println("Electicity");
                int bill =sc.nextInt();
                 s1 = String.valueOf(bill);
                 s = "\n Electricity : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            }
            if(i == 3)
            {
                System.out.println("Water");
                int bill =sc.nextInt();
                 s1 = String.valueOf(bill);
                 s = "\n Water       : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            }
            if(i == 4)
            {
                System.out.println("Gas");
                int bill =sc.nextInt();
                 s1 = String.valueOf(bill);
                 s = "\n Gas         : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            }
            if(i == 5)
            {
                System.out.println("Grocery");
                int bill =sc.nextInt();
                 s1 = String.valueOf(bill);
                 s = "\n Grocery     : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            }
            if(i == 6)
            {
                System.out.println("Cloths");
                int bill =sc.nextInt();
                s1 = String.valueOf(bill);
                 s = "\n Cloths      : "+s1;
                 b =s.getBytes();
                os.write(b);
                list.add(new budget(bill));
            }
        } 
       /* int total=0;
        for(int j=1;j<=6;j++)
        {
        	 total =total+ar[j];
        }
        System.out.println(total);*/
        //int total=0;
        int total=0;
        for(budget bud:list)
        {
           total = total + bud.bill;
        }
                 String s1 = String.valueOf(total);
                 s = "\n Total Buget you Spent for Home is : "+s1;
                 b =s.getBytes();
                os.write(b);
        System.out.println("Total Buget you Spent for Home is "+total);        
        os.close();
        // int sum = list.parallelStream().reduce(0, (output, o) -> output + o.getLength(), (j, k) -> j + k);
        // System.out.println(sum);        
        
	}
}